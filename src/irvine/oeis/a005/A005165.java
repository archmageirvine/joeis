package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005165 Alternating factorials: <code>n! - (n-1)! + (n-2)! - ... 1!</code>.
 * @author Sean A. Irvine
 */
public class A005165 implements Sequence {

  private long mN = -1;
  private Z mF = Z.ONE;
  private Z mA = Z.ONE;

  @Override
  public Z next() {
    if (++mN > 1) {
      mF = mF.multiply(mN);
    }
    mA = mF.subtract(mA);
    return mA;
  }
}
