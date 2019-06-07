package irvine.oeis.a016;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A016101 <code>(n! - n)/2</code> for even <code>n</code>.
 * @author Sean A. Irvine
 */
public class A016101 implements Sequence {

  private long mN = 0;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    mF = mF.multiply(++mN).multiply(++mN);
    return mF.subtract(mN).divide2();
  }
}
