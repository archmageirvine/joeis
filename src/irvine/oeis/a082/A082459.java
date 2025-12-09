package irvine.oeis.a082;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A082459 Multiply by 1, add 1, multiply by 2, add 2, etc.
 * @author Sean A. Irvine
 */
public class A082459 extends Sequence0 {

  private Z mA = null;
  private boolean mMultiply = true;
  private long mN = 1;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.NEG_ONE;
      return Z.NEG_ONE;
    }
    if (mMultiply) {
      mA = mA.multiply(mN);
      mMultiply = false;
    } else {
      mA = mA.add(mN);
      ++mN;
      mMultiply = true;
    }
    return mA;
  }
}

