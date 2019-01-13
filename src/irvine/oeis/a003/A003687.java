package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A003687.
 * @author Sean A. Irvine
 */
public class A003687 implements Sequence {

  private Z mProd = null;
  private Z mA = null;

  @Override
  public Z next() {
    if (mProd == null) {
      mProd = Z.ONE;
      return Z.ONE;
    }
    if (mA == null) {
      mA = Z.TWO;
      return Z.TWO;
    }
    final Z t = mA.subtract(mProd);
    mProd = mProd.multiply(mA);
    mA = t;
    return mA;
  }
}
