package irvine.math.q;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;

/**
 * Utility functions.
 * @author Sean A. Irvine
 */
public final class QUtils {

  private QUtils() { }

  /**
   * The Sagher map for rationals.
   * The Sagher map sends <code>Product p_i^e_i / Product q_i^f_i</code> to <code>Product p_i^(2e_i) * Product q_i^(2f_i-1)</code>.
   * @param n rational
   * @return corresponding integer
   */
  public static Z sagher(final Q n) {
    Z prod = Z.ONE;
    final FactorSequence fsNum = Jaguar.factor(n.num());
    for (final Z p : fsNum.toZArray()) {
      prod = prod.multiply(p.pow(2L * fsNum.getExponent(p)));
    }
    final FactorSequence fsDen = Jaguar.factor(n.den());
    for (final Z p : fsDen.toZArray()) {
      prod = prod.multiply(p.pow(2L * fsDen.getExponent(p) - 1));
    }
    return prod;
  }

  /**
   * The inverse Sagher map.
   * @param n integer
   * @return corresponding rational
   */
  public static Q inverseSagher(final Z n) {
    Q prod = Q.ONE;
    final FactorSequence fs = Jaguar.factor(n);
    for (final Z p : fs.toZArray()) {
      final int e = fs.getExponent(p);
      if ((e & 1) == 0) {
        prod = prod.multiply(p.pow(e / 2));
      } else {
        prod = prod.divide(p.pow((e + 1) / 2));
      }
    }
    return prod;
  }

  /**
   * Convert a comma separated list of rationals into an array.
   * @param s string
   * @return array of rationals
   */
  public static Q[] toQ(String s) {
    if (s.isEmpty()) {
      return new Q[0];
    }
    final char first = s.charAt(0);
    final char last = s.charAt(s.length() - 1);
    if ((first == '[' || first == '{' || first == '(') && (last == ']' || last == '}' || last == ')')) {
      s = s.substring(1, s.length() - 1);
    }
    if (s.isEmpty()) {
      return new Q[0];
    }
    final String[] parts = s.split(",");
    final Q[] res = new Q[parts.length];
    for (int k = 0; k < parts.length; ++k) {
      res[k] = Q.valueOf(parts[k]);
    }
    return res;
  }

  /**
   * Parse a string representing a rational polynomial into a list of coefficients.
   * @param polynomial polynomial
   * @return list of coefficients
   */
  public static List<Q> parsePolynomial(String polynomial) {
    polynomial = polynomial.replaceAll("\\s+", "");

    // Regex pattern to match terms of the form:
    // optional sign, optional parens, fraction or integer, optional *x, optional ^exponent
    final Pattern termPattern = Pattern.compile(
      "([+-]?)(\\(?\\d+(?:/\\d+)?\\)?)" +     // Coefficient (possibly fraction)
        "(?:\\*?x(?:\\^(\\d+))?)?"              // Optional x and optional exponent
    );

    final Matcher matcher = termPattern.matcher(polynomial);
    final Map<Integer, Q> terms = new HashMap<>();

    while (matcher.find()) {
      final String sign = matcher.group(1);
      String coeffStr = matcher.group(2);
      final String exponentStr = matcher.group(3);

      coeffStr = coeffStr.replace("(", "").replace(")", "");
      if (sign != null && sign.equals("-")) {
        coeffStr = "-" + coeffStr;
      }

      final Q coeff = new Q(coeffStr);
      if (!coeff.isZero()) {
        final int exponent = matcher.group(0).contains("x") ? exponentStr != null ? Integer.parseInt(exponentStr) : 1 : 0;
        terms.put(exponent, coeff);
      }
    }

    // Determine the maximum exponent to size the list
    final int maxDegree = terms.keySet().stream().max(Integer::compareTo).orElse(0);
    final List<Q> result = new ArrayList<>();
    for (int k = 0; k <= maxDegree; ++k) {
      result.add(terms.getOrDefault(k, Q.ZERO));
    }
    return result;
  }
}
