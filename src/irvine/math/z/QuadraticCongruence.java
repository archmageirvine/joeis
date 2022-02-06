package irvine.math.z;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.TreeSet;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;

/**
 * Solve quadratic congruence equations.
 * @author Sean A. Irvine
 */
public class QuadraticCongruence {

  private static final Collection<Z> MOD4 = Arrays.asList(Z.ONE, Z.THREE);
  private static final Collection<Z> MOD8 = Arrays.asList(Z.ONE, Z.THREE, Z.FIVE, Z.SEVEN);

  /**
   * Solve <code>x^2=a (mod p)</code>
   * @param a constant
   * @param p modulus
   * @return solutions
   */
  public static Collection<Z> solve(Z a, final Z p) {
    System.out.println("Trying to solve x^2=" + a + " (mod " + p + ")");
//    if (a.signum() < 0) {
//      a = a.add(p);
//    }
    final Z t = a.modSqrt(p);
    if (t == null) {
      return Collections.emptySet();
    }
    final TreeSet<Z> res = new TreeSet<>();
    res.add(t);
    res.add(p.subtract(t).mod(p));
    System.out.println("Solution: " + res);
    return res;
  }

  /**
   * Solve <code>x^2=a (mod p)</code>
   * @param a constant
   * @param p modulus
   * @return solutions
   */
  public static Collection<Z> solve(final Z a, final Z p, final int e) {
    System.out.println("Trying to solve x^2=" + a + " (mod " + p + "^" +e + ")");
    if (e == 1) {
      return solve(a, p);
    }
    if (a.isZero()) {
      final TreeSet<Z> res = new TreeSet<>();
      res.add(Z.ZERO);
      res.add(p.pow(e - 1));
      return res;
    }
    if (Z.TWO.equals(p)) {
      if (e == 2) {
        return a.mod(4) == 1 ? MOD4 : Collections.emptySet();
      }
      if (Z.FOUR.equals(a)) { // todo remove this ugly special case?
        return Arrays.asList(Z.TWO, Z.SIX);
      }
      if (a.mod(8) != 1) {
        return Collections.emptySet();
      }
      if (e == 3) {
        return MOD8;
      }

      // Hensel Lemma
      final Collection<Z> prev = solve(a, p, e - 1);
      if (prev.isEmpty()) {
        return prev;
      }
      final Z pe = p.pow(e);
      for (final Z x : prev) {
        final Z z = x.multiply2().modInverse(p.pow(e - 1));
        for (final Z h : solve(z, p, e - 1)) {
          Z r = x.subtract(x.square().subtract(a).multiply(h)).mod(pe);
          if (r.signum() < 0) {
            r = r.add(pe);
          }
          final TreeSet<Z> res = new TreeSet<>();
          res.add(r);
          res.add(pe.subtract(r));
          return res;
        }
      }

      return null;
    }
    // Hensel Lemma
    final Collection<Z> prev = solve(a, p, e - 1);
    if (prev.isEmpty()) {
      return prev;
    }
    final Z pe = p.pow(e);
//    for (final Z x : prev) {
//      final Z z = x.multiply2().modInverse(p.pow(e - 1));
//      for (final Z h : solve(z, p, e - 1)) {
//        Z r = x.subtract(x.square().subtract(a).multiply(h)).mod(pe);
//        if (r.signum() < 0) {
//          r = r.add(pe);
//        }
//        final TreeSet<Z> res = new TreeSet<>();
//        res.add(r);
//        res.add(pe.subtract(r));
//        System.out.println("Returning from Hensel with " + res);
//        return res;
//      }
//    }
    for (final Z x : prev) {
      final Z z = x.multiply2();
      //final Z z = x.multiply2().modInverse(p);
      Z r = x.subtract(x.square().subtract(a)).divide(z);
//      if (r.signum() < 0) {
//        r = r.add(pe);
//      }
      final TreeSet<Z> res = new TreeSet<>();
      res.add(r);
      res.add(pe.subtract(r));
      System.out.println("Returning from Hensel with " + res);
      return res;
    }
    return null;
  }

  /**
   * Solve <code>a*x^2+b*x+c = 0 (mod p^e)</code>
   * @param a coefficient
   * @param b coefficient
   * @param c coefficient
   * @param p prime modulus
   * @param e exponent on p
   * @return list of solutions
   */
  public static Collection<Z> solve(final Z a, final Z b, final Z c, final Z p, final int e) {
//    if (e > 1) {
//      // Hensel Lemma
//      final Collection<Z> prev = solve(a, b, c, p, e - 1);
//      if (prev.isEmpty()) {
//        return prev;
//      }
//      final Z pe = p.pow(e);
//      for (final Z x : prev) {
//        final Z z = x.multiply2().modInverse(p.pow(e - 1));
//        for (final Z h : solve(z, p, e - 1)) {
//          Z r = x.subtract(x.square().subtract(a).multiply(h)).mod(pe);
//          if (r.signum() < 0) {
//            r = r.add(pe);
//          }
//          final TreeSet<Z> res = new TreeSet<>();
//          res.add(r);
//          res.add(pe.subtract(r));
//          return res;
//        }
//      }
//      throw new UnsupportedOperationException();
//    }
    final Z d = b.square().subtract(a.multiply(c).multiply(4));
    final Z pe = p.pow(e);
    System.out.println("Discriminant: " + d + " -> " + d.jacobi(pe));
    switch (d.jacobi(pe)) {
      case -1:
        return Collections.emptySet();
      case 0:
        return Collections.singleton(p.subtract(b).modMultiply(a.multiply2().modInverse(p), p));
      default: // 1
        final TreeSet<Z> res = new TreeSet<>();
        final Z inv = a.multiply2().modInverse(p);
        for (final Z s : solve(d, p, e)) {
          res.add(s.subtract(b).modMultiply(inv, p));
        }
        return res;
    }
  }

  /**
   * Solve <code>a*x^2+b*x+c = 0 (mod n)</code>
   * @param a coefficient
   * @param b coefficient
   * @param c coefficient
   * @param n modulus
   * @return list of solutions
   */
  public static Collection<Z> solve(final Z a, final Z b, final Z c, final Z n) {
    if (n.isProbablePrime()) {
      return solve(a, b, c, n, 1);
    }
    final FactorSequence fs = Cheetah.factor(n);
    Collection<Z> res = Collections.emptyList();
    Z mod = Z.ONE;
    for (final Z p : fs.toZArray()) {
      final Collection<Z> r = new TreeSet<>();
      final Z m = p.pow(fs.getExponent(p));
      final Collection<Z> ss = solve(a, b, c, p, fs.getExponent(p));
      System.out.println("ss: " + ss);
      if (ss.isEmpty()) {
        return ss; // there is no solution
      }
      if (res.isEmpty()) {
        res = ss;
      } else {
        for (final Z s : ss) {
          for (final Z u : res) {
            r.add(ZUtils.chineseRemainderTheorem(new Z[] {s, u}, new Z[] {m, mod}));
          }
        }
        res = r;
      }
      mod = mod.multiply(m);
      System.out.println("res is now: " + res);
    }
    return res;
  }

  /**
   * Noddy.
   * @param args equation.
   */
  public static void main(final String... args) {
    final Z a = new Z(args[0]);
    final Z b = new Z(args[1]);
    final Z c = new Z(args[2]);
    final Z n = new Z(args[3]);
    System.out.println(solve(a, b, c, n));
  }
}
