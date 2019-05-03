package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A002058 Number of internal triangles in all triangulations of an <code>(n+1)-gon</code>.
 * @author Sean A. Irvine
 */
public class A002058 implements Sequence {

  private long mN = 4;
  private Z mA = Z.TWO;

  @Override
  public Z next() {
    if (++mN > 5) {
      mA = mA.multiply(Z.valueOf(mN).square().multiply2().add(15 - 11 * mN).multiply2()).divide(mN).divide(mN - 5);
    }
    return mA;
  }
}
