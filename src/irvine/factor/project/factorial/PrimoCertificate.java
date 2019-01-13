package irvine.factor.project.factorial;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.zip.GZIPInputStream;

import irvine.math.elliptic.EllipticCurveMod;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;

/**
 * Verify a certificate produced by the Primo program.
 *
 * @author Sean A. Irvine
 */
public final class PrimoCertificate {

  private PrimoCertificate() { }

  private static boolean handleHeader(final BufferedReader reader) throws IOException {
    boolean sawPrimo = false;
    boolean sawFormat3 = false;
    boolean sawStatus = false;
    String line;
    while ((line = reader.readLine()) != null && !"[Candidate]".equals(line)) {
      if (!line.isEmpty()) {
        if ("[PRIMO - Primality Certificate]".equals(line)) {
          sawPrimo = true;
        } else if ("Format=3".equals(line)) {
          sawFormat3 = true;
        } else if ("Status=Candidate certified prime".equals(line)) {
          sawStatus = true;
        }
      }
    }
    return sawPrimo && sawFormat3 && sawStatus;
  }

  private static Z getCandidate(final BufferedReader reader) throws IOException {
    String line;
    Z n = null;
    while ((line = reader.readLine()) != null && !"[1]".equals(line)) {
      if (line.startsWith("N$=")) {
        n = new Z(line.substring(3), 16);
      }
    }
    return n;
  }

  private static boolean expect(final HashMap<String, Z> map, final boolean verbose, final String... keys) {
    for (final String k : keys) {
      if (!map.containsKey(k + "$")) {
        if (verbose) {
          System.out.println(k + " parameter missing");
        }
        return false;
      }
    }
    return true;
  }

  private static boolean nMinus1(final Z n, final Z s, final Z r, final Z b, final boolean verbose) {
    if (s.compareTo(r) >= 0) {
      if (verbose) {
        System.out.println("s<r violated");
      }
      return false;
    }
    if (!n.equals(s.multiply(r).add(1))) {
      if (verbose) {
        System.out.println("n != s * r + 1");
      }
      return false;
    }
    if (!Z.ONE.equals(b.modPow(n.subtract(Z.ONE), n))) {
      if (verbose) {
        System.out.println("b^(n-1) != 1 mod n");
      }
      return false;
    }
    if (!Z.ONE.equals(b.modPow(s, n).subtract(Z.ONE).gcd(n))) {
      if (verbose) {
        System.out.println("gcd(b^s-1,n) != 1");
      }
      return false;
    }
    return true;
  }

  private static Z lucasV(final Z h, final Z n, final Z j, final Z p) {
    Z m = n;
    Z v = h;
    Z w = h.square().subtract(m.multiply2()).mod(p);
    for (int k = j.bitLength() - 2; k >= 0; --k) {
      final Z x = v.multiply(w).subtract(h.multiply(m)).mod(p);
      final Z twoM = m.multiply2();
      v = v.square().subtract(twoM).mod(p);
      w = w.square().subtract(twoM.multiply(n)).mod(p);
      m = m.square().mod(p);
      if (j.testBit(k)) {
        v = x;
        if (k != 0) { // save a multiply on last iteration
          m = n.modMultiply(m, p);
        }
      } else {
        w = x;
      }
    }
    return v;
  }

  private static boolean nPlus1(final Z n, final Z s, final Z r, final Z q, final boolean verbose) {
    if (s.compareTo(r) >= 0) {
      if (verbose) {
        System.out.println("s<r violated");
      }
      return false;
    }
    if (!n.equals(s.multiply(r).subtract(Z.ONE))) {
      if (verbose) {
        System.out.println("n != s*r -1");
      }
      return false;
    }
    final Z p = q.isEven() ? Z.ONE : Z.TWO;
    /*
    if (!Z.ONE.equals(p.gcd(q))) {
      if (verbose) {
        System.out.println("gcd(p, q) != 1");
      }
      return false;
    }
    */
    if (p.square().subtract(q.multiply(4)).jacobi(n) != -1) {
      if (verbose) {
        System.out.println("Jacobi(p^2-4q, n) != -1");
      }
      return false;
    }
    if (!Z.ZERO.equals(lucasV(p, q, n.add(1).divide2(), n))) {
      if (verbose) {
        System.out.println("V[(N+1)/2] != 0");
      }
      return false;
    }
    if (Z.ZERO.equals(lucasV(p, q, s.divide2(), n))) {
      if (verbose) {
        System.out.println("V[S/2] == 0");
      }
      return false;
    }
    return true;
  }

  private static boolean isPrime(final Z n, final boolean verbose) {
    if (n.compareTo(Z.TWO) < 0) {
      if (verbose) {
        System.out.println("n<2");
      }
      return false;
    }
    if (n.equals(Z.TWO)) {
      return true;
    }
    if (!n.testBit(0)) {
      if (verbose) {
        System.out.println("n even, n != 2");
      }
      return false;
    }
    if (!ZUtils.sprpTest(2L, n)) {
      if (verbose) {
        System.out.println("n fails base 2 pseudoprime test");
      }
      return false;
    }
    if (!ZUtils.sprpTest(3L, n)) {
      if (verbose) {
        System.out.println("n fails base 3 pseudoprime test");
      }
      return false;
    }
    if (!ZUtils.sprpTest(5L, n)) {
      if (verbose) {
        System.out.println("n fails base 5 pseudoprime test");
      }
      return false;
    }
    if (!ZUtils.sprpTest(7L, n)) {
      if (verbose) {
        System.out.println("n fails base 7 pseudoprime test");
      }
      return false;
    }
    if (n.compareTo(new Z("1186670087467")) < 0) {
      return true; // [PSW80,Jae93]
    }
    if (!ZUtils.sprpTest(11L, n)) {
      if (verbose) {
        System.out.println("n fails base 11 pseudoprime test");
      }
      return false;
    }
    if (n.compareTo(new Z("2152302898747")) < 0) {
      return true; // [Jae93]
    }
    if (!ZUtils.sprpTest(13L, n)) {
      if (verbose) {
        System.out.println("n fails base 13 pseudoprime test");
      }
      return false;
    }
    if (n.compareTo(new Z("3474749660383")) < 0) {
      return true; // [Jae93]
    }
    if (!ZUtils.sprpTest(17L, n)) {
      if (verbose) {
        System.out.println("n fails base 17 pseudoprime test");
      }
      return false;
    }
    if (n.compareTo(new Z("341550071728321")) < 0) {
      return true; // [Jae93]
    }
    if (verbose) {
      System.out.println("n exeeds limit for deterministic pseudoprime testing");
    }
    return false;
  }

  private static boolean ecTest(final Z n, final Z a, final Z b, final Z t, final Z r, final Z s, final boolean verbose) {
    if (s.compareTo(Z.ONE) <= 0) {
      if (verbose) {
        System.out.println("s <= 1");
      }
      return false;
    }
    if (r.compareTo(n.root(4).add(1).square()) <= 0) {
      if (verbose) {
        System.out.println("r <= (n^(1/4)+1)^2");
      }
      return false;
    }
    final Z l = t.square().multiply(t).add(a.multiply(t)).add(b).mod(n);
    final Z y = l.square().mod(n);
    final Z aa = a.modMultiply(y, n);
    final Z bb = b.modMultiply(y.multiply(l), n);
    final Z x = t.modMultiply(l, n);
    final EllipticCurveMod curve = new EllipticCurveMod(aa, bb, n);
    final Z[] ps = curve.multiply(new Z[]{x, y}, s);
    return ps != null && curve.multiply(ps, r) == null;
  }

  private static boolean case3(final HashMap<String, Z> parameters, final boolean verbose, final Z n) {
    if (!expect(parameters, verbose, "A", "B", "T", "R", "S")) {
      return false;
    }
    return ecTest(n, parameters.get("A$"), parameters.get("B$"), parameters.get("T$"), parameters.get("R$"), parameters.get("S$"), verbose);
  }

  @SuppressWarnings("fallthrough")
  private static boolean verify(final HashMap<String, Z> parameters, final boolean verbose, final int type, final Z n) {
    switch (type) {
    case 0: // Strong pseudoprime test
      return isPrime(n, verbose);
    case 1: // N-1 test
      if (!expect(parameters, verbose, "S", "R", "B")) {
        return false;
      }
      return nMinus1(n, parameters.get("S$"), parameters.get("R$"), parameters.get("B$"), verbose);
    case 2: // N+1 test
      if (!expect(parameters, verbose, "S", "R", "Q")) {
        return false;
      }
      return nPlus1(n, parameters.get("S$"), parameters.get("R$"), parameters.get("Q$"), verbose);
    case 4: // Elliptic curve with specified J
      if (!expect(parameters, verbose, "J")) {
        return false;
      }
      final Z j = parameters.get("J$");
      final Z nj = j.negate().add(1728);
      parameters.put("A$", j.multiply(3).multiply(nj));
      parameters.put("B$", j.multiply2().multiply(nj.square()));
      return case3(parameters, verbose, n);
    case 3:
      return case3(parameters, verbose, n);
    case -1:
      if (verbose) {
        System.out.println("No type found for test");
      }
      return false;
    default:
      if (verbose) {
        System.out.println("Unknown test type " + type);
      }
      return false;
    }
  }

  private static final String TYPE = "Type=";

  private static boolean verify(final BufferedReader reader, final boolean verbose, final Z m) throws IOException {
    Z n = m;
    while (true) {
      String line;
      int type = -1;
      final HashMap<String, Z> parameters = new HashMap<>();
      while ((line = reader.readLine()) != null && !line.startsWith("[")) {
        if (line.startsWith(TYPE)) {
          if (type != -1) {
            throw new IOException("Corrupt file, Type seen more than once");
          }
          type = Integer.parseInt(line.substring(TYPE.length()));
        } else if (!line.isEmpty()) {
          final int equals = line.indexOf('=');
          if (equals == -1) {
            throw new IOException("Corrupt file, missing `=' on line `" + line + "'");
          }
          parameters.put(line.substring(0, equals), new Z(line.substring(equals + 1), 16));
        }
      }
      System.out.print('.');
      System.out.flush();
      if (!verify(parameters, verbose, type, n)) {
        return false;
      }
      n = parameters.get("R$");
      parameters.clear();
      if (line.startsWith("[Signature]")) {
        System.out.println("[OK]");
        return true;
      }
    }
  }

  /**
   * Attempt verification of a primality certificate produced by the Primo
   * program.
   *
   * @param reader the certificate
   * @param verbose be verbose
   * @return true if certificate is valid
   */
  public static boolean verify(final BufferedReader reader, final boolean verbose) {
    try {
      if (!handleHeader(reader)) {
        if (verbose) {
          System.out.println("Header was invalid.");
        }
        return false;
      }
      final Z n = getCandidate(reader);
      if (n == null) {
        if (verbose) {
          System.out.println("Could not read candidate.");
          return false;
        }
      }
      return verify(reader, verbose, n);
    } catch (final IOException e) {
      if (verbose) {
        System.err.println(e.getMessage());
      }
      return false;
    }
  }


  /**
   * Attempt verification of a primality certificate produced by the Primo
   * program.
   *
   * @param certificate the certificate
   * @param verbose be verbose
   * @return true if certificate is valid
   */
  public static boolean verify(final File certificate, final boolean verbose) {
    try {
      final BufferedReader r;
      if (certificate.getPath().endsWith(".gz")) {
        r = new BufferedReader(new InputStreamReader(new GZIPInputStream(new FileInputStream(certificate))));
      } else {
        r = new BufferedReader(new FileReader(certificate));
      }
      try {
        return verify(r, verbose);
      } finally {
        r.close();
      }
    } catch (final IOException e) {
      if (verbose) {
        System.err.println(e.getMessage());
      }
      return false;
    }
  }


  /**
   * Verify files specified on the command line.
   * @param args files to verify
   */
  public static void main(final String... args) {
    for (final String f : args) {
      System.out.println("Verifying: " + f);
      verify(new File(f), true);
    }
  }
}
