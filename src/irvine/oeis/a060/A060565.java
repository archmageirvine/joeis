package irvine.oeis.a060;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A060565 Follow trajectory of 2n+1 in the '3x+1' problem until a lower number is reached; A060445 gives number of steps for this to happen. Sequence gives the first lower number that is reached.
 * @author Sean A. Irvine
 */
public class A060565 extends Sequence1 {

  private Z mN = Z.ONE;

  static Z droppingValue(final Z n) {
    if (Z.ONE.equals(n)) {
      return Z.ZERO;
    }
    Z m = n;
    while (m.compareTo(n) >= 0) {
      m = m.isEven() ? m.divide2() : m.multiply(3).add(1);
    }
    return m;
  }

  @Override
  public Z next() {
    mN = mN.add(2);
    return droppingValue(mN);
  }
}
