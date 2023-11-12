package irvine.math.z;

import java.util.Random;

/**
 * Primality testing.
 * @author Sean A. Irvine
 */
final class Prime {

  private Prime() { }

  /** Special limits used in primality testing. */
  private static final int P2L = (int) (2152302898747L & Z.BASE_MASK);
  private static final int P2H = (int) (2152302898747L >>> Z.BASE_BITS);
  private static final int P3L = (int) (3474749660383L & Z.BASE_MASK);
  private static final int P3H = (int) (3474749660383L >>> Z.BASE_BITS);
  private static final int P4L = (int) (341550071728321L & Z.BASE_MASK);
  private static final int P4H = (int) (341550071728321L >>> Z.BASE_BITS);
  private static final Random RANDOM = new Random();

  private static boolean isKnownMersennePrime(final int exponent) {
    // We only need to list values larger than 60 here due to other previous tests
    switch (exponent) {
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
        return false;
    }
  }

  static boolean primeTest(final Z n, final int certainty, final boolean exact) {
    // handle negative and zero
    if (n.mSign <= 0) {
      return false;
    }
    final int v = n.mValue[0];
    if (n.mSign == 1) {
      if (v <= 2) {
        return v == 2;
      }
      // handle even numbers
      if ((v & 1) == 0) {
        return false;
      }
      // handle 3 and its multiples
      if (v % 3L == 0) {
        return v == 3L;
      }
    } else {
      // handle even numbers
      if ((v & 1) == 0) {
        return false;
      }
    }
    if (n.mSign > 2) {
      // Special check for known Mersenne primes, these numbers
      // crop up quite often and can be very large.  In binary,
      // they have an all 1s representation.
      final int exponent = n.bitLength();
      if (n.bitCount() == exponent) {
        if (isKnownMersennePrime(exponent)) {
          return true;
        }
        if (exponent < 23249425) {
          return false;
        }
        // 2^n-1 is never prime for n composite
        if (!Z.valueOf(exponent).isProbablePrime(certainty)) {
          return false;
        }
        if (exact) {
          // apply Lucas-Lehmer method, because this will be slow
          // for big arguments it is only done when proof is required
          Z s = Z.FOUR;
          for (int i = 2; i < exponent; ++i) {
            s = s.modPow(Z.TWO, n).subtract(Z.TWO);
          }
          return s.isZero();
        }
      }
    }

    // check small bases and use known constraints
    if (!ZUtils.sprpTest(2L, n)) {
      return false;
    }
    if (!ZUtils.sprpTest(3L, n)) {
      return false;
    }
    if (n.mSign == 1 && v < 1373653) {
      return true; // [PSW80]
    }
    if (!ZUtils.sprpTest(5L, n)) {
      return false;
    }
    if (n.mSign == 1 && v < 25326001) {
      return true;  // [PSW80]
    }
    if (!ZUtils.sprpTest(7L, n)) {
      return false;
    }
    if (n.mSign == 1) {
      return true;
    }
    if (!ZUtils.sprpTest(11L, n)) {
      return false;
    }
    final int u = n.mValue[1];
    if (n.mSign == 2 && (u < P2H || (u == P2H && v < P2L))) {
      // n < 2152302898747 // [Jae93]
      return true;
    }
    if (!ZUtils.sprpTest(13L, n)) {
      return false;
    }
    if (n.mSign == 2 && (u < P3H || (u == P3H && v < P3L))) {
      // n < 3474749660383 // [Jae93]
      return true;
    }
    if (!ZUtils.sprpTest(17L, n)) {
      return false;
    }
    if (n.mSign == 2 && (u < P4H || (u == P4H && v < P4L))) {
      // n < 341550071728321 // [Jae93]
      return true;
    }
    // [n > 341550071728321, n odd]

    // Perform additional tests up to the required certainty level
    for (int k = 7; k < certainty; ++k) {
      if (!ZUtils.sprpTest(19L + RANDOM.nextInt(Integer.MAX_VALUE), n)) {
        return false;
      }
    }

    if (n.isSquare()) {
      return false;
    }

    if (exact) {
      throw new ArithmeticException("Sorry, number is too hard for me.");
    }
    return true;
  }

}
