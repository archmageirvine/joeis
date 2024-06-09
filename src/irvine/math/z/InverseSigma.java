package irvine.math.z;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.util.Pair;

/**
 * Routines relating to inverting the sigma function.
 * @author Sean A. Irvine
 */
public final class InverseSigma {

  // Based on https://home.gwu.edu/~maxal/gpscripts/invphi.gp
  // See
  // M. A. Alekseyev, Computing the Inverses, their Power Sums, and Extrema for
  // Euler's Totient and Other Multiplicative Functions,
  // Journal of Integer Sequences 19 (2016), Article 16.5.2
  // https://cs.uwaterloo.ca/journals/JIS/VOL19/Alekseyev/alek5.html

  private InverseSigma() { }

  /**
   * Return all solutions to <code>sigma_k(x) = n</code>.
   * @param n number
   * @param k parameter
   * @return solutions.
   */
  public static Set<Z> inverseSigma(final Z n, final long k) {
    return Z.ONE.equals(n) ? Collections.singleton(Z.ONE) : dynamicSet(n, k, cookSigma(n, k));
  }

  /**
   * Return number of solutions to <code>sigma_k(x) = n</code>.
   * @param n number
   * @param k parameter
   * @return number of solutions.
   */
  public static Z countInverseSigma(final Z n, final long k) {
    return Z.ONE.equals(n) ? Z.ONE : dynamicNum(n, cookSigma(n, k));
  }

  /**
   * Return number of solutions to <code>sigma(x) = n</code>.
   * @param n number
   * @return number of solutions.
   */
  public static Z countInverseSigma(final Z n) {
    return countInverseSigma(n, 1);
  }

  /**
   * Minimum solution to <code>sigma_k(x) = n</code>.
   * @param n number
   * @param k parameter
   * @return number of solutions.
   */
  public static Z minInverseSigma(final Z n, final long k) {
    return Z.ONE.equals(n) ? Z.ONE : dynamicMin(n, cookSigma(n, k));
  }

  /**
   * Maximum solution to <code>sigma_k(x) = n</code>.
   * @param n number
   * @param k parameter
   * @return number of solutions.
   */
  public static Z maxInverseSigma(final Z n, final long k) {
    return Z.ONE.equals(n) ? Z.ONE : dynamicMax(n, cookSigma(n, k));
  }

  private static Map<Z, List<Pair<Z, Z>>> cookSigma(final Z n, final long k) {
    final Map<Z, List<Pair<Z, Z>>> lst = new TreeMap<>();
    for (final Z d : Jaguar.factor(n).divisors()) {
      if (Z.ONE.equals(d)) {
        continue;
      }
      for (final Z p : Jaguar.factor(d.subtract(1)).toZArray()) {
        final Z q = p.pow(k).subtract(1).multiply(d).add(1);
        final long t = Functions.VALUATION.i(q, p);
        if (t <= k || t % k != 0 || !q.equals(p.pow(t))) {
          continue;
        }
        // we have d = sigma_k(p^(t/k - 1))
        final Pair<Z, Z> pair = new Pair<>(d, p.pow(t / k - 1));
        final List<Pair<Z, Z>> l = lst.get(p);
        if (l == null) {
          final ArrayList<Pair<Z, Z>> newL = new ArrayList<>();
          lst.put(p, newL);
          newL.add(pair);
        } else {
          l.add(pair);
        }
      }
    }
    // System.out.println("Returning with " + n + "," + k + " -> " + lst);
    return lst;
  }

  private static Z dynamicNum(final Z n, final Map<Z, List<Pair<Z, Z>>> lst) {
    TreeMap<Z, Z> r = new TreeMap<>();
    r.put(Z.ONE, Z.ONE);
    for (final List<Pair<Z, Z>> l : lst.values()) {
      final TreeMap<Z, Z> t = new TreeMap<>(r);
      for (final Pair<Z, Z> pair : l) {
        for (final Z d : Jaguar.factor(n.divide(pair.left())).divisors()) {
          final Z key = d.multiply(pair.left());
          t.put(key, t.getOrDefault(key, Z.ZERO).add(r.getOrDefault(d, Z.ZERO)));
        }
      }
      r = t;
    }
    return r.getOrDefault(n, Z.ZERO);
  }

  private static Z dynamicMin(final Z n, final Map<Z, List<Pair<Z, Z>>> lst) {
    // Uses -1 to represent infinity
    TreeMap<Z, Z> r = new TreeMap<>();
    r.put(Z.ONE, Z.ONE);
    for (final List<Pair<Z, Z>> l : lst.values()) {
      final TreeMap<Z, Z> t = new TreeMap<>(r);
      for (final Pair<Z, Z> pair : l) {
        for (final Z d : Jaguar.factor(n.divide(pair.left())).divisors()) {
          final Z key = d.multiply(pair.left());
          final Z p = r.getOrDefault(d, Z.NEG_ONE).multiply(pair.right());
          final Z cur = t.getOrDefault(key, Z.NEG_ONE);
          if (cur.signum() < 0 || (p.signum() > 0 && p.compareTo(cur) < 0)) {
            t.put(key, p);
          }
        }
      }
      r = t;
    }
    return r.get(n);
  }

  private static Z dynamicMax(final Z n, final Map<Z, List<Pair<Z, Z>>> lst) {
    TreeMap<Z, Z> r = new TreeMap<>();
    r.put(Z.ONE, Z.ONE);
    for (final List<Pair<Z, Z>> l : lst.values()) {
      final TreeMap<Z, Z> t = new TreeMap<>(r);
      for (final Pair<Z, Z> pair : l) {
        for (final Z d : Jaguar.factor(n.divide(pair.left())).divisors()) {
          final Z key = d.multiply(pair.left());
          final Z p = r.getOrDefault(d, Z.ZERO).multiply(pair.right());
          final Z cur = t.getOrDefault(key, Z.ZERO);
          t.put(key, cur.max(p));
        }
      }
      r = t;
    }
    return r.get(n);
  }

  // todo k parameter here only used for extra check that should really not be needed
  private static Set<Z> dynamicSet(final Z n, final long k, final Map<Z, List<Pair<Z, Z>>> lst) {
    TreeMap<Z, Set<Z>> r = new TreeMap<>();
    r.put(Z.ONE, Collections.singleton(Z.ONE));
    for (final List<Pair<Z, Z>> l : lst.values()) {
      final TreeMap<Z, Set<Z>> t = new TreeMap<>(r);
      for (final Pair<Z, Z> pair : l) {
        final Z left = pair.left();
        final Z right = pair.right();
        for (final Z d : Jaguar.factor(n.divide(left)).divisors()) {
          final Set<Z> s = r.get(d);
          if (s != null) {
            final Z key = d.multiply(left);
            final Set<Z> res = t.getOrDefault(key, new HashSet<>());
            for (final Z v : s) {
              final Z w = v.multiply(right);
              if (Functions.SIGMA.z(k, w).equals(key)) { // it would be nice to avoid the need for this test
                res.add(w);
              }
            }
            t.put(key, res);
          }
        }
      }
      r = t;
    }
    return r.getOrDefault(n, Collections.emptySet());
  }
}

