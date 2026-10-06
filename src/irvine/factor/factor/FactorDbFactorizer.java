package irvine.factor.factor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;

/**
 * Attempt to factor by direct connection to <code>factordb.com</code>.
 * Uses the FactorDB JSON-RPC API.
 * @author Sean A. Irvine
 */
public class FactorDbFactorizer extends AbstractFactorizer {

  private static final String API_URL = "https://factordb.com:4059/rpc";

  /*
   * FactorDB status codes:
   *
   * P   = proven prime
   * PRP = probable prime
   * C   = composite
   * CF  = composite/factored
   * U   = unknown
   */
  private static int status(final String s) {
    switch (s) {
      case "P":
        return FactorSequence.PRIME;
      case "PRP":
        return FactorSequence.PROB_PRIME;
      case "C":
      case "CF":
      case "U":
      default:
        return FactorSequence.COMPOSITE;
    }
  }

  /**
   * Make a FactorDB JSON-RPC request.
   * @param method method name
   * @param params parameters encoded as JSON
   * @return JSON response
   * @throws IOException if the request fails
   */
  private static String rpc(final String method, final String params) throws IOException {
    final URL url = new URL(API_URL);
    final HttpURLConnection connection = (HttpURLConnection) url.openConnection();
    connection.setRequestMethod("POST");
    connection.setDoOutput(true);
    connection.setConnectTimeout(30000);
    connection.setReadTimeout(120000);
    connection.setRequestProperty("Content-Type", "application/json");
    connection.setRequestProperty("Accept", "application/json");

    final String request =
      "{\"jsonrpc\":\"2.0\",\"id\":1,\"method\":\""
        + method
        + "\",\"params\":"
        + params
        + "}";

    try (final OutputStream out = connection.getOutputStream()) {
      out.write(request.getBytes(StandardCharsets.UTF_8));
    }

    final int responseCode = connection.getResponseCode();
    final InputStream stream = responseCode >= 200 && responseCode < 300
      ? connection.getInputStream()
      : connection.getErrorStream();

    final StringBuilder sb = new StringBuilder();
    try (final BufferedReader reader = new BufferedReader(new InputStreamReader(stream, StandardCharsets.UTF_8))) {
      String line;
      while ((line = reader.readLine()) != null) {
        sb.append(line);
      }
    } finally {
      connection.disconnect();
    }

    if (responseCode < 200 || responseCode >= 300) {
      throw new IOException("FactorDB HTTP " + responseCode + ": " + sb);
    }
    final String response = sb.toString();
    if (response.contains("\"error\"")) {
      throw new IOException("FactorDB error: " + response);
    }
    return response;
  }

  /**
   * Escape a string for use in JSON.
   *
   * @param s string
   * @return escaped string
   */
  private static String jsonString(final String s) {
    final StringBuilder sb = new StringBuilder(s.length() + 2);
    sb.append('"');
    for (int k = 0; k < s.length(); ++k) {
      final char c = s.charAt(k);
      switch (c) {
        case '"':
          sb.append("\\\"");
          break;
        case '\\':
          sb.append("\\\\");
          break;
        case '\b':
          sb.append("\\b");
          break;
        case '\f':
          sb.append("\\f");
          break;
        case '\n':
          sb.append("\\n");
          break;
        case '\r':
          sb.append("\\r");
          break;
        case '\t':
          sb.append("\\t");
          break;
        default:
          sb.append(c);
          break;
      }
    }
    sb.append('"');
    return sb.toString();
  }

  /**
   * Obtain the known factors of n from FactorDB.
   * @param n number to factor
   * @return list of factors
   * @throws IOException if the request fails
   */
  private static List<Factor> getFactors(final Z n) throws IOException {
    final String params = "{\"target\":{\"expr\":" + jsonString(n.toString()) + "}}";
    final String response = rpc("get_factors", params);
    final int factorsPos = response.indexOf("\"factors\"");
    if (factorsPos < 0) {
      throw new IOException("No factors in FactorDB response: " + response);
    }
    final int arrayStart = response.indexOf('[', factorsPos);
    if (arrayStart < 0) {
      throw new IOException("No factors array in FactorDB response: " + response);
    }
    final int arrayEnd = findMatching(response, arrayStart, '[', ']');
    if (arrayEnd < 0) {
      throw new IOException("Malformed factors array: " + response);
    }
    final String array = response.substring(arrayStart + 1, arrayEnd);
    return parseFactors(array);
  }

  /**
   * Parse the factors array.
   * @param json contents of factors array
   * @return factors
   */
  private static List<Factor> parseFactors(final String json) {
    final List<Factor> result = new ArrayList<>();
    int p = 0;
    while (p < json.length()) {
      final int objectStart = json.indexOf('{', p);
      if (objectStart < 0) {
        break;
      }
      final int objectEnd = findMatching(json, objectStart, '{', '}');
      if (objectEnd < 0) {
        break;
      }
      final String object = json.substring(objectStart, objectEnd + 1);
      final String base = getJsonString(object, "base");
      final String exponent = getJsonValue(object, "exponent");
      final String factorStatus = getJsonString(object, "status");
      if (base != null && exponent != null) {
        result.add(new Factor(new Z(base), Integer.parseInt(exponent), status(factorStatus)));
      }
      p = objectEnd + 1;
    }

    return result;
  }

  private static String getJsonString(final String json, final String name) {
    final String tag = "\"" + name + "\"";
    final int p = json.indexOf(tag);
    if (p < 0) {
      return null;
    }
    int q = json.indexOf(':', p + tag.length());
    if (q < 0) {
      return null;
    }
    ++q;
    while (q < json.length() && Character.isWhitespace(json.charAt(q))) {
      ++q;
    }
    if (q >= json.length() || json.charAt(q) != '"') {
      return null;
    }
    ++q;
    final StringBuilder sb = new StringBuilder();
    boolean escaped = false;
    while (q < json.length()) {
      final char c = json.charAt(q++);
      if (escaped) {
        switch (c) {
          case 'b':
            sb.append('\b');
            break;
          case 'f':
            sb.append('\f');
            break;
          case 'n':
            sb.append('\n');
            break;
          case 'r':
            sb.append('\r');
            break;
          case 't':
            sb.append('\t');
            break;
          case '"':
          case '\\':
          case '/':
          default:
            sb.append(c);
            break;
        }
        escaped = false;
      } else if (c == '\\') {
        escaped = true;
      } else if (c == '"') {
        return sb.toString();
      } else {
        sb.append(c);
      }
    }
    return null;
  }

  private static String getJsonValue(final String json, final String name) {
    final String tag = "\"" + name + "\"";
    final int p = json.indexOf(tag);
    if (p < 0) {
      return null;
    }
    int q = json.indexOf(':', p + tag.length());
    if (q < 0) {
      return null;
    }
    ++q;
    while (q < json.length() && Character.isWhitespace(json.charAt(q))) {
      ++q;
    }
    final int start = q;
    while (q < json.length()) {
      final char c = json.charAt(q);
      if (!Character.isDigit(c) && c != '-') {
        break;
      }
      ++q;
    }
    return start == q ? null : json.substring(start, q);
  }

  /*
   * Find the matching closing bracket.
   */
  private static int findMatching(final String s, final int start, final char open, final char close) {
    int depth = 0;
    boolean quoted = false;
    boolean escaped = false;
    for (int k = start; k < s.length(); ++k) {
      final char c = s.charAt(k);
      if (quoted) {
        if (escaped) {
          escaped = false;
        } else if (c == '\\') {
          escaped = true;
        } else if (c == '"') {
          quoted = false;
        }
        continue;
      }
      if (c == '"') {
        quoted = true;
      } else if (c == open) {
        ++depth;
      } else if (c == close && --depth == 0) {
        return k;
      }
    }
    return -1;
  }

  private static final class Factor {
    private final Z mBase;
    private final int mExponent;
    private final int mStatus;

    Factor(final Z base, final int exponent, final int status) {
      mBase = base;
      mExponent = exponent;
      mStatus = status;
    }
  }

  @Override
  protected void factor(final FactorSequence fs, Z n) {
    message("Trying: " + n);

    final int exponent = fs.getExponent(n);
    fs.remove(n);

    // Remove any negative first.
    if (n.signum() < 0) {
      n = n.negate();
      if ((exponent & 1) == 1) {
        fs.add(-1L);
      }
    }

    if (Z.ONE.equals(n)) {
      return;
    }

    try {
      message("Querying FactorDB for: " + n);
      final List<Factor> factors = getFactors(n);
      message("FactorDB returned " + factors.size() + " factors");
      for (final Factor factor : factors) {
        message("Factor: " + factor.mBase + "^" + factor.mExponent + " [" + factor.mStatus + "]");
        // Ignore a factor equal to the original number.
        if (n.equals(factor.mBase)) {
          continue;
        }
        for (int k = 0; k < factor.mExponent; ++k) {
          if (!n.mod(factor.mBase).isZero()) {
            break;
          }
          fs.add(factor.mBase, factor.mStatus, exponent);
          n = n.divide(factor.mBase);
        }
      }
    } catch (final IOException e) {
      throw new RuntimeException(e);
    }

    // If FactorDB did not completely factor n, retain the remaining cofactor
    if (!Z.ONE.equals(n)) {
      final int status = n.isProbablePrime()
        ? FactorSequence.PROB_PRIME
        : FactorSequence.COMPOSITE;
      fs.add(n, status, exponent);
    }
  }

  /**
   * Attempt to factor each of the supplied arguments.
   * @param args numbers to factor
   */
  public static void main(final String[] args) {
    factorize(new FactorDbFactorizer(), args);
  }
}
