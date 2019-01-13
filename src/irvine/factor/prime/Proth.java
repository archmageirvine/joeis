package irvine.factor.prime;

import irvine.math.z.Z;

/**
 * Implements the Proth primality test.
 *
 * @author Sean A. Irvine
 */
public class Proth extends AbstractPrime {

  /**
   * Test if the given number is prime. If the return value is false then the
   * number is definitely composite. If the return value is true then the number
   * is a definitely prime. If the test cannot be applied to the supplied
   * number then an ArithmeticException is thrown.
   *
   * @param n value to test
   * @return true if n is prime, false if n is composite
   * @exception ArithmeticException if test cannot be applied to <code>n</code>
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
    if (n.equals(Z.THREE)) {
      return true;
    }
    if (!n.testBit(0)) {
      return false;
    }
    // [n > 4 is odd]

    // let n = k*2^l+1, extract k and l
    final Z n1 = n.clearBit(0);
    final int l = n1.getLowestSetBit();
    final Z n1r = n1.divide2();
    final Z k = n1.shiftRight(l);

    // compare k with 2^l, test valid for k <= 2^l
    final Z l2 = Z.ONE.shiftLeft(l);
    if (k.compareTo(l2) > 0) {
      throw new ArithmeticException("Proth test not applicable");
    }

    // if 3 does not divide k, then do this test first
    if (!k.mod(Z.THREE).equals(Z.ZERO)) {
      return Z.THREE.modPow(n1r, n).equals(n1);
    }

    // test for a perfect square since Jacobi search will fail on such numbers
    final Z s = n.sqrtAndRemainder()[1];
    if (Z.ZERO.equals(s)) {
      return false;
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

}
