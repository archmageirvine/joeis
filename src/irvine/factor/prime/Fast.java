package irvine.factor.prime;

import java.io.Serializable;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;

/**
 * Implements various tests to be a good general purpose tester.
 * @author Sean A. Irvine
 */
public class Fast extends AbstractPrime implements Serializable {

  private final Feral mFeral = new Feral();

  /**
   * Strong probable prime test.
   *
   * @param base base to try
   * @param n number to test
   * @return false if number if definitely composite
   */
  private boolean sprpTest(final long base, final long n) {
    final long minusone = n - 1L;
    int s = 0;
    long power = minusone;
    do {
      power >>>= 1;
      ++s;
    } while ((power & 1L) == 0L);
    long t = LongUtils.modPow(base, power, n);
    if (t == 1L || t == minusone) {
      return true;
    }
    while (--s > 0) {
      t *= t;
      t %= n;
      if (t == minusone) {
        return true;
      }
    }
    return false;
  }

  /**
   * Test if the given number is prime. If the return value is false then the
   * number is definitely composite. If the return value is true then the number
   * is a probable prime.
   *
   * @param n value to test
   * @return true if n is a (probable) prime, false if n is composite
   */
  @Override
  public boolean isPrime(final long n) {
    if ((n & 1) == 0) {
      return n == 2;
    }
    if (n < 0) {
      return false;
    }
    if (n < Feral.N) {
      return mFeral.isSmallPrime(n);
    }
    if (n % 3 == 0 || n % 5 == 0 || n % 7 == 0) {
      // Cases n == 3, 5, 7 already handled by feral
      return false;
    }

    // If argument is large, switch to Z code
    if (n > SQRT_MAX_VALUE) {
      return isPrime(Z.valueOf(n));
    }

    // check base-2 and base-3 strong pseudoprimes
    if (!sprpTest(2L, n)) {
      return false;
    }
    if (!sprpTest(3L, n)) {
      return false;
    }
    // if (n < 1373653L) { // Feral already tests this far
    //   return true; // [PSW80]
    // }
    if (!sprpTest(5L, n)) {
      return false;
    }
    // if (n < 25326001L) { // Feral already tests this far
    //   return true; // [PSW80]
    // }
    if (!sprpTest(7L, n)) {
      return false;
    }
    if (n == 3215031751L) {
      return false;
    }
    // n < 1186670087467 // [PSW80,Jae93]
    return true;
  }

  private static final Z C1 = new Z("2152302898747");
  private static final Z C2 = new Z("3474749660383");
  private static final Z C3 = new Z("341550071728321");

  /**
   * Test if the given number is prime. If the return value is false then the
   * number is definitely composite. If the return value is true then the number
   * is a probable prime.
   *
   * @param n value to test
   * @return true if n is a (probable) prime, false if n is composite
   */
  @Override
  public boolean isPrime(final Z n) {

    // handle even numbers
    if (n.compareTo(Z.TWO) < 0) {
      return false;
    }
    if (n.equals(Z.TWO)) {
      return true;
    }
    if (!n.testBit(0)) {
      return false;
    }
    // for small arguments, switch to long code
    if (n.compareTo(Z.valueOf(SQRT_MAX_VALUE)) <= 0) {
      return isPrime(n.longValue());
    }

    // handle Mersenne numbers 2^n-1 (such numbers are all 1s in binary)
    final int length = n.bitLength();
    if (n.bitCount() == length) {
      // test against known Mersenne primes larger than 31 bits
      switch (length) {
        case 61:
        case 89:
        case 107:
        case 127:
        case 521:
        case 607:
        case 1279:
        case 2203:
        case 2281:
        case 3217:
        case 4253:
        case 4423:
        case 9689:
        case 9941:
        case 11213:
        case 19937:
        case 21701:
        case 23209:
        case 44497:
        case 86243:
        case 110503:
        case 132049:
        case 216091:
        case 756839:
        case 859433:
        case 1257787:
        case 1398269:
        case 2976221:
        case 3021377:
        case 6972593:
        case 13466917:
        case 20996011:
        case 24036583:
        case 25964951:
        case 30402457:
        case 32582657:
        case 37156667:
        case 42643801:
        case 43112609:
        case 57885161:
        case 74207281:
        case 77232917:
        case 82589933:
          return true;
        default:
          if (length < 23249425) {
            return false;
          }
          final LucasLehmer ll = new LucasLehmer();
          return ll.isPrime(n);
      }
    }

    // [n > 3037000499 = SQRT_MAX_VALUE]
    if (!ZUtils.sprpTest(2L, n)) {
      return false;
    }
    if (!ZUtils.sprpTest(3L, n)) {
      return false;
    }
    if (!ZUtils.sprpTest(5L, n)) {
      return false;
    }
    if (!ZUtils.sprpTest(7L, n)) {
      return false;
    }
    /*
    if (n.compareTo(new Z("1186670087467")) < 0) {
      return true; // [PSW80,Jae93]
    }
    */
    if (!ZUtils.sprpTest(11L, n)) {
      return false;
    }
    if (n.compareTo(C1) < 0) {
      return true; // [Jae93]
    }
    if (!ZUtils.sprpTest(13L, n)) {
      return false;
    }
    if (n.compareTo(C2) < 0) {
      return true; // [Jae93]
    }
    if (!ZUtils.sprpTest(17L, n)) {
      return false;
    }
    if (n.compareTo(C3) < 0) {
      return true; // [Jae93]
    }
    // [n > 341550071728321, n odd]

    // test for a perfect square
    final Z[] s = n.sqrtAndRemainder();
    if (Z.ZERO.equals(s[1])) {
      return false;
    }

    // [n > 341550071728321, n odd, n not a perfect square]

    // apply Proth test if appropriate, let n = k*2^l+1, extract k and l
    final Z n1 = n.clearBit(0);
    final int l = n1.getLowestSetBit();
    final Z n1r = n1.divide2();
    final Z k = n1.shiftRight(l);

    // compare k with 2^l, test valid for k <= 2^l
    final Z l2 = Z.ONE.shiftLeft(l);
    if (k.compareTo(l2) <= 0) {
      // if 3 does not divide k, then do this test first
      if (!k.mod(Z.THREE).equals(Z.ZERO)) {
        return Z.THREE.modPow(n1r, n).equals(n1);
      }

      // [ n > 4 is odd and square free and 3 | k ]

      // search for a quadratic nonresidue and perform test
      Z base = Z.THREE;
      while (true) {
        base = base.add(Z.TWO);
        if (base.jacobi(n) == -1 && !k.mod(base).equals(Z.ZERO)) {
          return base.modPow(n1r, n).equals(n1); // congruent -1
        }
      }
    }
    return true; // status actually unknown
  }

  @Override
  public long nextPrime(final long n) {
    final long p = mFeral.nextPrime(n);
    if (p != 0) {
      return p;
    }
    return super.nextPrime(n);
  }

  @Override
  public long prevPrime(final long n) {
    final long p = mFeral.prevPrime(n);
    if (p != 0) {
      return p;
    }
    return super.prevPrime(n);
  }
}
