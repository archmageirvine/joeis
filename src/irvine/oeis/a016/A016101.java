package irvine.oeis.a016;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A016101 (n! - n)/2 for even n.
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
