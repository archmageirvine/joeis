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
  public static Collection<Z> solve(final Z a, final Z p) {
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
    System.out.println("Trying to solve x^2=" + a + " (mod " + p + "^" + e + ")");
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
      final TreeSet<Z> res = new TreeSet<>();
      for (final Z x : prev) {
          final Z pe1 = p.pow(e - 1);
          final Z x2 = x.multiply2();
          final Z[] euc = x2.extendedGcd(pe1);
          final Z z = x.subtract(x.square().subtract(a).multiply(euc[1])).mod(pe);
          System.out.println(x2 + "*" + euc[1] + "+" + pe1 + "*" + euc[2] + "=" + euc[0] + " ---> " + z);
          if (z.square().subtract(a).mod(pe).isZero()) {
            // todo this check should be unecessary ??
            res.add(z);
            res.add(pe.subtract(z));
          }
      }
      System.out.println("Returning from Hensel with " + res);
      return res;
    }
    // Hensel Lemma
    final Collection<Z> prev = solve(a, p, e - 1);
    if (prev.isEmpty()) {
      return prev;
    }
    final Z pe = p.pow(e);
    for (final Z x : prev) {
      final Z pe1 = p.pow(e - 1);
      final Z x2 = x.multiply2();
      final Z[] euc = x2.extendedGcd(pe1);
      final Z z = x.subtract(x.square().subtract(a).multiply(euc[1])).mod(pe);
      System.out.println(x2 + "*" + euc[1] + "+" + pe1 + "*" + euc[2] + "=" + euc[0] + " ---> " + z);
      final TreeSet<Z> res = new TreeSet<>();
      res.add(z);
      res.add(pe.subtract(z));
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
    final Z pe = p.pow(e);
    final Z d = b.square().subtract(a.multiply(c).multiply(4));
    System.out.println("Request to solve: " + a + "*x^2 + " + b + "*x + " + c + " = 0 (mod " + p + "^" + e + ") with discriminant " + d + " -> " + d.jacobi(pe));
    if (b.mod(pe).isZero() && Z.ONE.equals(a)) {
      System.out.println("Using b=0 shortcut");
      return solve(pe.subtract(c), p, e);
    }
    switch (d.jacobi(pe)) {
      case -1:
        return Collections.emptySet();
      case 0:
        // todo is this dubious for p==2?
        return Collections.singleton(p.subtract(b).modMultiply(a.multiply2().extendedGcd(pe)[1], pe));
      default: // 1
        final TreeSet<Z> res = new TreeSet<>();
        //final Z inv = a.multiply2().modInverse(pe);
        for (final Z s : solve(d, p, e)) {
          final Z[] euc = a.multiply2().extendedGcd(pe);
          res.add(s.subtract(b).multiply(euc[1]));
          //res.add(s.subtract(b).modMultiply(inv, pe));
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
    System.out.println("Request to solve: " + a + "*x^2 + " + b + "*x + " + c + " = 0 (mod " + n + ")");
    if (c.mod(n).isZero()) {
      // Simplify to a linear congruence
      final Collection<Z> res = new TreeSet<>();
      res.add(Z.ZERO);
      final Z[] euc = a.extendedGcd(n);
      res.add(euc[1].negate());
      return res;
    }
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
