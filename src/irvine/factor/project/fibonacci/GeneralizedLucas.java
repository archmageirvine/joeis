package irvine.factor.project.fibonacci;

import java.util.HashMap;

import irvine.factor.factor.Cheetah;
import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;

/**
 * Compute generalized Lucas numbers
 *
 * @author Sean A. Irvine
 */
public final class GeneralizedLucas {

  private GeneralizedLucas() { }

  private static final HashMap<String, Z> U_CACHE = new HashMap<>();

  /**
   * Compute generalized Lucas number <code>U_n(P,Q)</code>.
   * @param p parameter
   * @param q parameter
   * @param n index
   * @return <code>U_n(P,Q)</code>.
   */
  public static Z u(final long p, final long q, final long n) {
    if (n == 0) {
      return Z.ZERO;
    }
    if (n == 1) {
      return Z.ONE;
    }
    final String key = n + "," + p + "," + q;
    final Z v = U_CACHE.get(key);
    if (v != null) {
      return v;
    }
    final Z t = u(p, q, n - 1).multiply(p).subtract(u(p, q, n - 2).multiply(q));
    U_CACHE.put(key, t);
    return t;
  }

  private static final HashMap<String, Z> V_CACHE = new HashMap<>();

  /**
   * Compute generalized Lucas number <code>V_n(P,Q)</code>.
   * @param p parameter
   * @param q parameter
   * @param n index
   * @return <code>V_n(P,Q)</code>.
   */
  public static Z v(final long p, final long q, final long n) {
    if (n == 0) {
      return Z.TWO;
    }
    if (n == 1) {
      return Z.valueOf(p);
    }
    final String key = n + "," + p + "," + q;
    final Z v = V_CACHE.get(key);
    if (v != null) {
      return v;
    }
    final Z t = v(p, q, n - 1).multiply(p).subtract(v(p, q, n - 2).multiply(q));
    V_CACHE.put(key, t);
    return t;
  }

  private static void factorTable(final long p, final long q) {
    for (long n = 2; n <= 1000; ++n) {
      Z u = u(p, q, n);
      final FactorSequence fs = new FactorSequence();
      for (final Z dd : Cheetah.factor(n).divisors()) {
        final long d = dd.longValue();
        if (d > 1 && d != n) {
          final Z g = u.gcd(u(p, q, d));
          fs.merge(Jaguar.factorAllowIncomplete(g));
          u = u.divide(g);
        }
      }
      fs.merge(Jaguar.factorAllowIncomplete(u));
      System.out.println(n + " " + FactorSequence.toString(fs));
    }
  }

  /**
   * Compute generalized Lucas numbers
   * @param args p q n
   */
  public static void main(final String[] args) {
    if (args.length != 3) {
      System.err.println("Usage: GeneralizedLucas p q n");
      return;
    }
    if ("factor-table".equals(args[2])) {
      factorTable(Long.parseLong(args[0]), Long.parseLong(args[1]));
    } else {
      final Z n = u(Long.parseLong(args[0]), Long.parseLong(args[1]), Long.parseLong(args[2]));
      System.out.println(n);
    }
  }

}
