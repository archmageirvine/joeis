package irvine.math.z;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Set;
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
   * @param a ant
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
   * Solve <code>x^2=a (mod p^e)</code>
   * @param a ant
   * @param p modulus
   * @return solutions
   */
  public static Collection<Z> solve(Z a, final Z p, final int e) {
    if (VERBOSE) {
      System.out.println(StringUtils.rep(' ', sIndent) + "Solving x^2=" + a + " (mod " + p + "^" + e + ")");
    }
//    final Collection<Z> res = solve(a, p);
//    if (e == 1 || res.isEmpty()) {
//      return res;
//    }
//
//    final Z pe = p.pow(e);
//    final ArrayList<Z> lift = new ArrayList<>();
//    for (Z soln : res) {
//      do {
//        lift.add(soln);
//        soln = soln.add(p);
//      } while (soln.compareTo(pe) <= 0);
//    }
//    return lift;


    if (e == 1) {
      return solve(a, p);
    }
    final Z pe1 = p.pow(e - 1);
    final Z pe = pe1.multiply(p);
    a = a.mod(pe);
    if (a.isZero()) {
      final TreeSet<Z> res = new TreeSet<>();
      Z soln = Z.ZERO;
      do {
        assert soln.modSquare(pe).isZero();
        res.add(soln);
        soln = soln.add(pe1).mod(pe);
      } while (!soln.isZero());
      if (VERBOSE) {
        System.out.println(StringUtils.rep(' ', sIndent) + "Returning with " + res);
      }
      return res;
    }
    if (a.signum() < 0) {
      a = a.add(pe);
    }
    if (Z.TWO.equals(p)) {
      if (e == 2) {
        return a.mod(4) == 1 ? MOD4 : Collections.emptySet();
      }
      if (Z.FOUR.equals(a)) { // todo remove this ugly special case?
        final ArrayList<Z> res = new ArrayList<>();
        for (Z t = Z.TWO; t.compareTo(pe) < 0; t = t.add(4)) {
          res.add(t);
        }
        return res;
      }
      if (e == 3) {
        if (a.mod(8) != 1) {
          return Collections.emptySet();
        }
        return MOD8;
      }

      // Hensel Lemma
      final Collection<Z> prev = solve(a, p, e - 1);
      final TreeSet<Z> res = new TreeSet<>();
      for (final Z x : prev) {
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
    } else {
      // Hensel Lemma
      final TreeSet<Z> res = new TreeSet<>();
      for (final Z x : solve(a, p, e - 1)) {
        final Z x2 = x.multiply2();
        final Z f = x.square().subtract(a);
        final Z[] euc = x2.extendedGcd(pe1);
        final Z z = x.subtract(f.multiply(euc[1])).mod(pe);
        //System.out.println("Expanding: " + x + " egxd -> " + Arrays.toString(euc) + " -> " + z + " " + pe.subtract(z).mod(pe));
        res.add(z);
        res.add(pe.subtract(z).mod(pe));
      }
      if (VERBOSE) {
        System.out.println(StringUtils.rep(' ', sIndent) + "Returning with " + res);
      }
      return res;
    }
  }

  private static Collection<Z> lift(final Collection<Z> res, Z lift, final Z a, final Z b, final Z c, final Z p, final Z pe) {
    // There must be a better way to do this step.
    // "lift" is a solution (mod p) and the idea is to lift to solutions (mod p^e).
    // We do this by testing each of lift + k*p -- but there should be a better way with Hensel lemma
    do {
      if (lift.square().multiply(a).add(lift.multiply(b)).add(c).mod(pe).isZero()) {
        res.add(lift);
      }
      lift = lift.add(p);
    } while (lift.compareTo(pe) < 0);
    return res;
  }

  // Based on Alpertron's code
  private static Set<Z> solveQuadraticEqModPowerOfP(final Z a, final Z b, final Z c, final Z prime, final int expon) {
    Z discriminant = b.square().subtract(a.multiply(c).multiply(4));
    final Z pe = prime.pow(expon);
    // Number of bits of square root of discriminant to compute: expon + bits_a + 1,
    // where bits_a is the number of least significant bits of a set to zero.
    // To compute the square root, compute the inverse of sqrt, so only multiplications are used.
    // f(x) = invsqrt(x), f_{n+1}(x) = f_n * (3 - x*f_n^2)/2
    // Get maximum power of prime which divide ValA.
    Z aOdd = a;
    int bitsAZero = 0;
    while (true) {
      final Z tmp1 = aOdd.mod(prime);
      if (aOdd.signum() == -1) {
        aOdd = aOdd.add(prime);
      }
      if (!tmp1.isZero()) {
        break;
      }
      aOdd = aOdd.divide(prime);
      ++bitsAZero;
    }
    discriminant = discriminant.mod(pe);
    // Get maximum power of prime which divide discriminant.
    int deltaZeros;
    if (discriminant.isZero()) {      // Discriminant is zero.
      deltaZeros = expon;
    } else {      // Discriminant is not zero.
      deltaZeros = 0;
      while (discriminant.mod(prime).isZero()) {
        discriminant = discriminant.divide(prime);
        ++deltaZeros;
      }
    }
    if (((deltaZeros & 1) != 0) && (deltaZeros < expon)) {
      // If delta is of type m*prime^n where m is not multiple of prime
      // and n is odd, there is no solution, so go out.
      return Collections.emptySet();
    }
    deltaZeros >>= 1;
    // Compute inverse of -2*A (mod prime^(expon - deltaZeros)).
    final Z ped = prime.pow(expon - deltaZeros);
    final Z inv = ped.subtract(aOdd.modMultiply(Z.TWO, ped)).modInverse(ped);
    Z sqrRoot;
    if (discriminant.isZero()) {     // Discriminant is zero.
      sqrRoot = Z.ZERO;
    } else {      // Discriminant is not zero.
      // Find number of digits of square root to compute.
      final int nbrBitsSquareRoot = expon + bitsAZero - deltaZeros;
      final Z ps = prime.pow(nbrBitsSquareRoot);
      discriminant = discriminant.mod(ps);
      if (discriminant.signum() < 0) {
        discriminant = discriminant.add(ps);
      }
      if (discriminant.mod(prime).jacobi(prime) != 1) {
        return Collections.emptySet(); // Not a quadratic residue, so go out.
      }
      // Compute square root of discriminant.
      sqrRoot = solve(discriminant, prime, expon).iterator().next();
      //sqrRoot = discriminant.modSqrt(ped);
      // Multiply by square root of discriminant by prime^deltaZeros.
      sqrRoot = sqrRoot.multiply(prime.pow(deltaZeros));
    }
    final TreeSet<Z> res = new TreeSet<>();
    final int correctBits = expon - deltaZeros;
    final Z q = prime.pow(correctBits);
    // Compute x = (b + sqrt(discriminant)) / (-2a) and x = (b - sqrt(discriminant)) / (-2a)
    final Z[] qr1 = b.add(sqrRoot).divideAndRemainder(prime.pow(bitsAZero));
    if (qr1[1].isZero()) {
      Z soln1 = qr1[0].modMultiply(inv, q);
      do {
        res.add(soln1);
        soln1 = soln1.add(q);
      } while (soln1.compareTo(pe) <= 0);
    }
    final Z[] qr2 = b.subtract(sqrRoot).divideAndRemainder(prime.pow(bitsAZero));
    if (qr2[1].isZero()) {
      Z soln2 = qr2[0].modMultiply(inv, q);
      do {
        res.add(soln2);
        soln2 = soln2.add(q);
      } while (soln2.compareTo(pe) <= 0);
    }
    return res;
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
        lift(res, Z.ZERO, a, b, c, p, pe);
        lift(res, a.modInverse(pe).modMultiply(pe.subtract(b), pe), a, b, c, p, pe);
        return res;
      } else {
        return lift(new ArrayList<>(), Z.ZERO, a, b, c, p, pe);
      }
    }

    final Z d = b.square().subtract(a.multiply(c).multiply(4)).mod(pe);
    if (VERBOSE) {
      System.out.println(StringUtils.rep(' ', sIndent) + "Request to solve: " + a + "*x^2 + " + b + "*x + " + c + " = 0 (mod " + p + "^" + e + ") with discriminant " + d + " jacobi=" + d.jacobi(pe));
    }

    if (b.mod(pe).isZero() && Z.ONE.equals(a) && !Z.TWO.equals(p)) {
      if (!Z.TWO.equals(p) && !a.mod(p).isZero()) {
        return solveQuadraticEqModPowerOfP(a, b, c, p, e);
      } else {
        if (VERBOSE) {
          System.out.println(StringUtils.rep(' ', sIndent) + "Using b=0 shortcut");
        }
        sIndent += 2;
        final Collection<Z> res = solve(pe.subtract(c), p, e);
        sIndent -= 2;
        return res;
      }
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

    return solveQuadraticEqModPowerOfP(a, b, c, p, e);
//    final int jacobi = d.jacobi(pe);
//    switch (jacobi) {
//      case -1:
//        return Collections.emptySet();
//      case 0:
//        return lift(new ArrayList<>(), p.subtract(b).modMultiply(a.multiply2().extendedGcd(pe)[1], p), a, b, c, p, pe);
//      default: // 1
//        // May not work because 2a in 2^k problematic
//        final TreeSet<Z> res = new TreeSet<>();
//        final Z[] euc = a.multiply2().extendedGcd(pe);
//        sIndent += 2;
//        for (final Z s : solve(d, p, e)) {
//          res.add(s.subtract(b).modMultiply(euc[1], pe));
//          if (VERBOSE) {
//            System.out.println(StringUtils.rep(' ', sIndent) + "after processing solution " + s + " res is now: " + res);
//          }
//        }
//        sIndent -= 2;
//        return res;
//    }
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

//  private static Set<Z> SolveQuadraticEqModPowerOf2(final int exponent, int factorIndex, Z pValA, Z pValB, Z pValC) {
//    int expon = exponent;
//    // ax^2 + bx + c = 0 (mod 2^expon)
//    // This follows the paper Complete solving the quadratic equation mod 2^n
//    // of Dehnavi, Shamsabad and Rishakani.
//    // Get odd part of A, B and C and number of bits to zero.
//    Z ValAOdd = pValA.makeOdd();
//    long bitsAZero = pValA.auxiliary();
//    Z ValBOdd = pValB.makeOdd(); // todo not used?
//    long bitsBZero = pValB.auxiliary();
//    Z ValCOdd = pValC.makeOdd();
//    int bitsCZero = (int) pValC.auxiliary();
//
//    if ((bitsAZero > 0) && (bitsBZero > 0) && (bitsCZero > 0)) {
//      long minExpon = bitsAZero;
//      if (minExpon < bitsBZero) {
//        minExpon = bitsBZero;
//      }
//      if (minExpon < bitsCZero) {
//        minExpon = bitsCZero;
//      }
//      bitsAZero -= minExpon;
//      bitsBZero -= minExpon;
//      bitsCZero -= minExpon;
//      expon -= minExpon;
//    }
//    if (((bitsAZero == 0) && (bitsBZero == 0) && (bitsCZero == 0)) ||
//      ((bitsAZero > 0) && (bitsBZero > 0) && (bitsCZero == 0))) {
//      return Collections.emptySet();   // No solutions, so go out.
//    }
//    if ((bitsAZero == 0) && (bitsBZero > 0)) {           // The solution in this case requires square root.
//      // compute s = ((b/2)^2 - a*c)/a^2, q = odd part of s,
//      // r = maximum exponent of power of 2 that divides s.
//      Z tmp1 = pValB.divide2().square().subtract(pValA.multiply(pValC));
//      Z K1 = Z.ONE.shiftLeft(expon).subtract(1);
//      ValCOdd = tmp1.and(K1); // (b/2) - a*c mod 2^n
//      //ComputeInversePower2(ValAOdd.limbs, tmp2.limbs, tmp1.limbs);
//      Z tmp2 = ValAOdd.modInverse(Z.ONE.shiftLeft(expon));
//      ValCOdd = ValCOdd.multiply(tmp2).and(K1);  // ((b/2) - a*c)/a mod 2^n
//      ValCOdd = ValCOdd.multiply(tmp2).and(K1);  // ((b/2) - a*c)/a^2 mod 2^n
//      Z sqrRoot;
//      if (ValCOdd.isZero()) {         // s = 0, so its square root is also zero.
//        sqrRoot = Z.ZERO;
//        expon -= expon / 2;
//      } else {
//        //DivideBigNbrByMaxPowerOf2(&bitsCZero, ValCOdd.limbs, &ValCOdd.nbrLimbs);
//        ValCOdd = ValCOdd.shiftRight(bitsCZero);
//        // At this moment, bitsCZero = r and ValCOdd = q.
//        if ((!ValCOdd.and(Z.SEVEN).equals(Z.ONE) || (bitsCZero & 1) == 1)) {
//          return Collections.emptySet();          // q != 1 or p2(r) == 0, so go out.
//        }
//        if (expon < 2) {                        // Modulus is 2.
//          sqrRoot = bitsCZero > 0 ? Z.ZERO : Z.ONE;
//        } else {
//          // Compute sqrRoot as the square root of ValCOdd.
//          expon -= bitsCZero / 2;
//          //ComputeSquareRootModPowerOf2(expon, bitsCZero);
//          sqrRoot = solve(ValCOdd, Z.TWO, expon).iterator().next();
//          expon--;
//          if (expon == (bitsCZero / 2)) {
//            expon++;
//          }
//        }
//      }
//      // x = sqrRoot - b/2a.
//      K1 = Z.ONE.shiftLeft(expon).subtract(1);
//      //ComputeInversePower2(ValAOdd.limbs, tmp2.limbs, tmp1.limbs);
//      tmp2 = ValAOdd.modInverse(Z.ONE.shiftLeft(expon));
//      tmp1 = pValB.divide2().multiply(tmp2).negate().and(K1); // -b / 2a mod 2^expon
//      Z soln1 = tmp1.add(sqrRoot).and(K1);
//      Z soln2 = tmp1.subtract(sqrRoot).and(K1);
//    } else if ((bitsAZero == 0) && (bitsBZero == 0)) {
//      Z Quadr = pValA.multiply2(); // 2a
//      Z Linear = pValB; // b
//      Z Const = pValC.divide2(); // c / 2
//      Z soln1 = findQuadraticSolution(common.quad.Solution1[factorIndex], expon - 1).multiply2();
//
//      Quadr = pValA.multiply2();
//      Linear = Quadr.add(pValB); // 2a+b
//      Const = pValA.add(pValB).add(pValC).divide2(); // (a+b+c)/2
//      Z soln2 = findQuadraticSolution(common.quad.Solution2[factorIndex], expon - 1).multiply2().subtract(1);
//    } else {
//      Quadr = pValA;
//      Linear = pValB;
//      Const = pValC;
//      Z soln1 = findQuadraticSolution(common.quad.Solution1[factorIndex], expon);
//      sol2Invalid = true;
//    }
//    final Z Q = Z.ONE.shiftLeft(expon);
//    return res;
//  }
}
