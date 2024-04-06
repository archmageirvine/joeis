package irvine.math.z;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.util.string.StringUtils;

/**
 * Solve the cubic congruence <code>x^3=a(mod n)</code>.
 * @author Sean A. Irvine
 */
public final class CubicCongruence {

  private CubicCongruence() {
  }

  private static final boolean VERBOSE = "true".equals(System.getProperty("oeis.verbose"));
  private static int sIndent = 0; // Used only for printing during verbose

  private static boolean isPrimitiveRoot(final Z g, final Z p, final Z phi, final Z[] phif) {
    for (final Z factor : phif) {
      if (g.modPow(phi.divide(factor), p).equals(Z.ONE)) {
        return false;
      }
    }
    return true;
  }

  private static Z findPrimitiveRoot(final Z p) {
    // Check for small primes
    if (p.equals(Z.TWO)) {
      return Z.ONE;
    }
    if (p.equals(Z.THREE)) {
      return Z.TWO;
    }
    // Find the smallest primitive root using brute force
    final Z phi = p.subtract(1);
    final Z[] phif = Jaguar.factor(p.subtract(1)).toZArray();
    for (Z i = Z.TWO; i.compareTo(p) < 0; i = i.add(Z.ONE)) {
      if (isPrimitiveRoot(i, p, phi, phif)) {
        return i;
      }
    }
    return Z.NEG_ONE;
  }

  /**
   * Solve <code>x^3=a (mod p)</code>
   * @param a argument
   * @param p modulus
   * @return solutions
   */
  public static Collection<Z> solveP(final Z a, final Z p) {
    if (VERBOSE) {
      System.out.println(StringUtils.rep(' ', sIndent) + "Solving x^3=" + a + " (mod " + p + ")");
    }
    final TreeSet<Z> res = new TreeSet<>();

    final Z g = findPrimitiveRoot(p);
    final Z p1 = p.subtract(1);
    final Z q = p1.divide(p1.gcd(Z.THREE));
    final Z b = g.modPow(q, p);
    final Z c = g.modPow(q.multiply(Z.valueOf(2)), p);
    final Z ap = a.mod(p);
    if (b.modPow(Z.THREE, p).equals(ap)) {
      res.add(b);
    }
    if (c.modPow(Z.THREE, p).equals(ap)) {
      res.add(c);
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

    final TreeSet<Z> lift = new TreeSet<>();
    for (final Z soln : res) {
      lift.addAll(lift(a, p, e, soln));
    }
    if (VERBOSE) {
      sIndent -= 2;
      System.out.println(StringUtils.rep(' ', sIndent) + " -> " + lift);
    }
    return lift;
  }

  private static Set<Z> lift(final Z a, final Z p, final long e, final Z r) {
    Set<Z> solutions = new HashSet<>();
    solutions.add(r);
    final Z pe = p.pow(e); // p^e

    Z pk = p;
    for (long k = 2; k <= e; k++) {
      final Z ppk = pk;
      pk = pk.multiply(p);
      final Set<Z> newSolutions = new HashSet<>();
      for (final Z residue : solutions) {
        // Compute f(residue) = residue^3 - a
        final Z fx = residue.modPow(Z.valueOf(3), pe).subtract(a).mod(pe);
        // Compute f'(residue) = 3 * residue^2
        final Z fxPrime = residue.modSquare(pk).multiply(3).mod(pk);

        // If f'(residue) is not invertible modulo pk, handle the special case
        if (!fxPrime.gcd(pk).equals(Z.ONE)) {
          // Find additional residues for f(residue) ≡ 0 (mod pk) by adding multiples of p
          Z liftedResidue = residue;
          while (liftedResidue.compareTo(pk) < 0) {
            if (liftedResidue.modPow(Z.THREE, pk).subtract(a).mod(pk).isZero()) {
              newSolutions.add(liftedResidue);
            }
            liftedResidue = liftedResidue.add(ppk);
          }
        } else {
          // Compute the modular inverse of f'(residue) modulo pk
          final Z inverse = fxPrime.modInverse(pk);

          // Compute Delta residue = -(f(residue)/f'(residue)) mod pk
          final Z deltaResidue = fx.modMultiply(inverse, pk).negate();

          // Update residue for next iteration: res = residue + Delta residue
          final Z res = residue.add(deltaResidue).mod(pk);

          // If res satisfies f(res) = 0 (mod pk), add it to newSolutions
          if (res.modPow(Z.THREE, pk).subtract(a).mod(pk).isZero()) {
            newSolutions.add(res);
          }
        }
      }
      solutions = newSolutions;
    }
    return solutions;
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
