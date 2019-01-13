package irvine.oeis.a051;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A051626.
 * @author Sean A. Irvine
 */
public class A051626 implements Sequence {

  private Z mN = Z.ZERO;

  /**
   * Test if a number has a terminating decimal representation.
   * @param n number to test
   * @return true if a terminating decimal
   */
  public static boolean isTerminatingDecimal(final Z n) {
    Z on = n.makeOdd();
    while (on.mod(5) == 0) {
      on = on.divide(5);
    }
    return Z.ONE.equals(on);
  }

  @Override
  public Z next() {
    mN = mN.add(1);
    if (isTerminatingDecimal(mN)) {
      return Z.ZERO;
    }
    long pow = 0;
    Z pow10 = Z.ONE;
    while (true) {
      ++pow;
      pow10 = pow10.multiply(10);
      Z m10 = pow10;
      for (long m = pow - 1; m >= 0; --m) {
        m10 = m10.divide(10);
        if (Z.ZERO.equals(pow10.subtract(m10).mod(mN))) {
          return Z.valueOf(pow - m);
        }
      }

    }
  }
}
