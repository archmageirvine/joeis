package irvine.math.z;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.TreeSet;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.util.string.StringUtils;

/**
 * Solve quadratic congruence equations.
 * @author Sean A. Irvine
 */
public final class QuadraticCongruence {

  // A054464 is a good test of this code

  // WARNING: This code likely contains many deficiencies and may yield incorrect results.

  private QuadraticCongruence() {
  }

  private static final boolean VERBOSE = "true".equals(System.getProperty("oeis.verbose"));
  private static final Collection<Z> MOD4 = Arrays.asList(Z.ONE, Z.THREE);
  private static final Collection<Z> MOD8 = Arrays.asList(Z.ONE, Z.THREE, Z.FIVE, Z.SEVEN);
  private static int sIndent = 0; // Used only for printing during debug

  /**
   * Solve <code>x^2=a (mod p)</code>
   * @param a constant
   * @param p modulus
   * @return solutions
   */
  public static Collection<Z> solve(Z a, final Z p) {
    if (a.signum() < 0) {
      a = a.add(p);
    }
    final Z t = a.modSqrt(p);
    if (t == null) {
      return Collections.emptySet();
    }
    final TreeSet<Z> res = new TreeSet<>();
    res.add(t);
    res.add(p.subtract(t).mod(p));
    if (VERBOSE) {
      System.out.println(StringUtils.rep(' ', sIndent) + "Solved: x^2=" + a + " (mod " + p + ")  -->  " + res);
    }
    return res;
  }

  /**
   * Solve <code>x^2=a (mod p)</code>
   * @param a constant
   * @param p modulus
   * @return solutions
   */
  public static Collection<Z> solve(Z a, final Z p, final int e) {
    if (VERBOSE) {
      System.out.println(StringUtils.rep(' ', sIndent) + "Solving x^2=" + a + " (mod " + p + "^" + e + ")");
    }
    if (e == 1) {
      return solve(a, p);
    }
    if (a.isZero()) {
      final TreeSet<Z> res = new TreeSet<>();
      res.add(Z.ZERO);
      res.add(p.pow(e - 1));
      return res;
    }
    if (a.signum() < 0) {
      a = a.add(p.pow(e));
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
          if (z.square().subtract(a).mod(pe).isZero()) {
            // todo this check should be unnecessary ??
            res.add(z);
            res.add(pe.subtract(z));
          }
      }
      if (VERBOSE) {
        System.out.println(StringUtils.rep(' ', sIndent) + "Returning from Hensel with " + res);
      }
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
      final TreeSet<Z> res = new TreeSet<>();
      res.add(z);
      res.add(pe.subtract(z));
      if (VERBOSE) {
        System.out.println(StringUtils.rep(' ', sIndent) + "Returning from Hensel with " + res);
      }
      return res;
    }
    return Collections.emptySet();
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
    if (c.mod(pe).isZero()) {
      // Simplify to a linear congruence, x * (a*x+b) == 0 (mod p^e)
      if (pe.gcd(a).equals(Z.ONE)) {
        final Collection<Z> res = new TreeSet<>();
        res.add(Z.ZERO);
        res.add(a.modInverse(pe).modMultiply(pe.subtract(b), pe));
        return res;
      } else {
        return Collections.singleton(Z.ZERO);
      }
    }

    final Z d = b.square().subtract(a.multiply(c).multiply(4)).mod(pe);
    if (VERBOSE) {
      System.out.println(StringUtils.rep(' ', sIndent) + "Request to solve: " + a + "*x^2 + " + b + "*x + " + c + " = 0 (mod " + p + "^" + e + ") with discriminant " + d + " jacobi=" + d.jacobi(pe));
    }
    if (b.mod(pe).isZero() && Z.ONE.equals(a)) {
      if (VERBOSE) {
        System.out.println(StringUtils.rep(' ', sIndent) + "Using b=0 shortcut");
      }
      sIndent += 2;
      final Collection<Z> res = solve(pe.subtract(c), p, e);
      sIndent -= 2;
      return res;
    }

    if (Z.TWO.equals(p)) {
      // todo This is terrible, it tries every possible value
      if (VERBOSE) {
        System.out.println(StringUtils.rep(' ', sIndent) + "Using special case for p=2");
      }
      final TreeSet<Z> res = new TreeSet<>();
      for (Z x = Z.ZERO; x.compareTo(pe) < 0; x = x.add(1)) {
        if (x.modSquare(pe).modMultiply(a, pe).add(x.modMultiply(b, pe)).add(c).mod(pe).isZero()) {
          res.add(x);
        }
      }
      return res;
    }

    final int jacobi = d.jacobi(pe);
    switch (jacobi) {
      case -1:
        return Collections.emptySet();
      case 0:
        Z soln = p.subtract(b).modMultiply(a.multiply2().extendedGcd(pe)[1], p);
        if (e == 1) {
          return Collections.singleton(soln);
        }
        // Lift solution
        final ArrayList<Z> lift = new ArrayList<>();
        do {
          lift.add(soln);
          soln = soln.add(p);
        } while (soln.compareTo(pe) <= 0);
        return lift;
      default: // 1
        // May not work because 2a in 2^k problematic
        final TreeSet<Z> res = new TreeSet<>();
        final Z[] euc = a.multiply2().extendedGcd(pe);
        sIndent += 2;
        for (final Z s : solve(d, p, e)) {
          res.add(s.subtract(b).modMultiply(euc[1], pe));
          if (VERBOSE) {
            System.out.println(StringUtils.rep(' ', sIndent) + "after processing solution " + s + " res is now: " + res);
          }
        }
        sIndent -= 2;
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
    if (VERBOSE) {
      System.out.println(StringUtils.rep(' ', sIndent) + "Request to solve: " + a + "*x^2 + " + b + "*x + " + c + " = 0 (mod " + n + ")");
    }
    if (n.isProbablePrime()) {
      sIndent += 2;
      final Collection<Z> res = solve(a, b, c, n, 1);
      if (VERBOSE) {
        System.out.println(StringUtils.rep(' ', sIndent) + "res is now: " + res);
      }
      sIndent -= 2;
      return res;
    }
    final FactorSequence fs = Jaguar.factor(n);
    Collection<Z> res = Collections.emptyList();
    Z mod = Z.ONE;
    for (final Z p : fs.toZArray()) {
      final int e = fs.getExponent(p);
      final Z pe = p.pow(e);
      sIndent += 2;
      final Collection<Z> ss = solve(a.mod(pe), b.mod(pe), c.mod(pe), p, e);
      if (VERBOSE) {
        System.out.println(StringUtils.rep(' ', sIndent) + "ss is: " + ss);
      }
      sIndent -= 2;
      if (ss.isEmpty()) {
        return ss; // there is no solution
      }
      if (res.isEmpty()) {
        res = ss;
      } else {
        if (VERBOSE) {
          System.out.println(StringUtils.rep(' ', sIndent + 2) + "Applying CRT Cartesian product on: " + ss + " and " + res);
        }
        final Collection<Z> r = new TreeSet<>();
        for (final Z s : ss) {
          for (final Z u : res) {
            final Z w = ZUtils.chineseRemainderTheorem(new Z[] {s, u}, new Z[] {pe, mod});
            r.add(w);
          }
        }
        res = r;
      }
      mod = mod.multiply(pe);
      if (VERBOSE) {
        System.out.println(StringUtils.rep(' ', sIndent + 2) + "res is now: " + res);
      }
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
