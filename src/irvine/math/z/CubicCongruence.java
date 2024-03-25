package irvine.math.z;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.TreeSet;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.util.string.StringUtils;

/**
 * Solve the cubic congruence <code>x^3=a(mod n)</code>.
 * @author Sean A. Irvine
 */
public final class CubicCongruence {

  // WARNING: This code likely contains many deficiencies and may yield incorrect results.

  private CubicCongruence() {
  }

  private static final boolean VERBOSE = "true".equals(System.getProperty("oeis.verbose"));
  private static int sIndent = 0; // Used only for printing during verbose

  /**
   * Solve <code>x^3=a (mod p)</code>
   * @param a ant
   * @param p modulus
   * @return solutions
   */
  public static Collection<Z> solveP(Z a, final Z p) {
    if (VERBOSE) {
      System.out.println(StringUtils.rep(' ', sIndent) + "Solving x^3=" + a + " (mod " + p + ")");
    }
    // This could be flaky
    if (a.signum() < 0) {
      a = a.add(p);
    }
    final TreeSet<Z> res = new TreeSet<>();
    Z x = Z.ONE;
    while (x.compareTo(p) < 0) {
      if (x.modPow(Z.THREE, p).equals(a)) {
        res.add(x);
        if (!Z.ONE.equals(x)) {
          res.add(x.modSquare(p)); // 1, x, x^2 are solutions
          if (VERBOSE) {
            System.out.println(StringUtils.rep(' ', sIndent) + " -> " + res);
          }
          return res;
        }
      }
      x = x.add(1);
    }
    if (VERBOSE) {
      System.out.println(StringUtils.rep(' ', sIndent) + " -> " + res);
    }
    return res;
  }

  /**
   * Solve <code>x^3=a (mod p^e)</code>
   * @param a residue
   * @param p modulus
   * @return solutions
   */
  public static Collection<Z> solve(final Z a, final Z p, final int e) {
    if (VERBOSE) {
      System.out.println(StringUtils.rep(' ', sIndent) + "Solving x^3=" + a + " (mod " + p + "^" + e + ")");
      sIndent += 2;
    }
    final Collection<Z> res = solveP(a, p);
    if (e == 1 || res.isEmpty()) {
      if (VERBOSE) {
        sIndent -= 2;
      }
      return res;
    }

    // This is not efficient, Hensel's Lemma should be applicable
    final Z pe = p.pow(e);
    final ArrayList<Z> lift = new ArrayList<>();
    for (Z soln : res) {
      do {
        if (soln.modPow(Z.THREE, pe).equals(a)) {
          lift.add(soln);
        }
        soln = soln.add(p);
      } while (soln.compareTo(pe) <= 0);
    }
    if (VERBOSE) {
      sIndent -= 2;
      System.out.println(StringUtils.rep(' ', sIndent) + " -> " + lift);
    }
    return lift;
  }

  /**
   * Solve <code>x^3 = a (mod n)</code>
   * @param a residue
   * @param n modulus
   * @return list of solutions
   */
  public static Collection<Z> solve(final Z a, final Z n) {
    if (VERBOSE) {
      System.out.println(StringUtils.rep(' ', sIndent) + "Request to solve: " + a + "*x^3 = 1 (mod " + n + ")");
    }
    if (n.isProbablePrime()) {
      sIndent += 2;
      final Collection<Z> res = solveP(a, n);
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
      final Collection<Z> ss = solve(a.mod(pe), p, e);
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
    final Z n = new Z(args[1]);
    System.out.println(solve(a, n));
  }
}
