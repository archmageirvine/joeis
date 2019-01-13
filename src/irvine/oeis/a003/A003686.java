package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A003686.
 * @author Sean A. Irvine
 */
public class A003686 implements Sequence {

  private Z mA = null;
  private Z mB = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.ONE;
      return Z.ONE;
    }
    if (mB == null) {
      mB = Z.TWO;
      return Z.TWO;
    }
    final Z t = mB.add(mA.multiply(mB.subtract(mA)));
    mA = mB;
    mB = t;
    return mB;
  }
}
