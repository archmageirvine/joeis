package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A002506.
 * @author Sean A. Irvine
 */
public class A002506 implements Sequence {

  private Z mA = Z.EIGHT;
  private long mN = -1;
  
  @Override
  public Z next() {
    if (++mN > 0) {
      mA = mA.multiply(mN).multiply(mN + 2).shiftLeft(2);
    }
    return mA;
  }
}
