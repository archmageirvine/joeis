package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000779.
 * @author Sean A. Irvine
 */
public class A000779 implements Sequence {

  private long mN = 0;
  private Z mDF = Z.TWO;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    if (++mN > 1) {
      mF = mF.multiply(mN - 1).multiply2();
      mDF = mDF.multiply(2 * mN - 1);
    }
    return mDF.subtract(mF);
  }
}
