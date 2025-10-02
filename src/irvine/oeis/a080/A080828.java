package irvine.oeis.a080;

import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A080816.
 * @author Sean A. Irvine
 */
public class A080828 extends Sequence2 {

  private static final Z Z17 = Z.valueOf(17);
  private long mN = 2;
  private Z mM = Z.TWO;

  @Override
  public Z next() {
    if (mM.isOne() || Z.FIVE.equals(mM) || Z17.equals(mM)) {
      mM = Z.valueOf(++mN);
    }
    mM = mM.isEven() ? mM.divide2() : mM.multiply(3).subtract(1);
    return mM;
  }
}

