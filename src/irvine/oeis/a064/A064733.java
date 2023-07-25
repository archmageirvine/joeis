package irvine.oeis.a064;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence0;
import irvine.oeis.a005.A005165;

/**
 * A064733 Final digits of A005165(2n) for large n, read from right.
 * @author Sean A. Irvine
 */
public class A064733 extends Sequence0 {

  private final Sequence mAlt = new A005165();
  private Z mA = mAlt.next();
  {
    mAlt.next();
  }
  private Z mB = mAlt.next();
  private Z mMod = Z.ONE;

  @Override
  public Z next() {
    final Z div = mMod;
    mMod = mMod.multiply(10);
    while (!mA.mod(mMod).equals(mB.mod(mMod))) {
      mA = mB;
      mAlt.next();
      mB = mAlt.next();
    }
    // One more step always seems to be enough
    mA = mB;
    mAlt.next();
    mB = mAlt.next();
    return mA.mod(mMod).divide(div);
  }
}

