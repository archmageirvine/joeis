package irvine.oeis.a034;

import irvine.math.z.Z;
import irvine.oeis.a000.A000217;

/**
 * A034893 Maximum of different products of partitions of n into distinct parts.
 * @author Sean A. Irvine
 */
public class A034893 extends A000217 {

  private int mN = 0;
  private int mM = 2;
  private int mT0 = 3;
  private int mT1 = 6;
  private Z mF = Z.TWO;

  @Override
  public Z next() {
    if (++mN <= 4) {
      super.next();
      return Z.valueOf(mN);
    }
    if (mN >= mT1) {
      mT0 = mT1;
      mT1 = super.next().intValueExact();
      mF = mF.multiply(++mM);
    }
    final int l = mN - mT0;
    assert l >= 0;
    if (l <= mM - 2) {
      return mF.multiply(mM + 1).divide(mM - l);
    } else if (l == mM - 1) {
      return mF.multiply(mM + 2).divide2();
    } else if (l == mM) {
      return mF.multiply(mM + 1);
    } else {
      throw new RuntimeException();
    }
  }
}
