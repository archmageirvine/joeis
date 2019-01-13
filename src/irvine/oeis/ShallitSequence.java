package irvine.oeis;

import irvine.math.z.Z;

/**
 * Shallit sequence.
 * @author Sean A. Irvine
 */
public class ShallitSequence implements Sequence {

  private final Z mInitA;
  private final Z mInitB;
  private Z mA = null;
  private Z mB = null;

  protected ShallitSequence(final long a, final long b) {
    mInitA = Z.valueOf(a);
    mInitB = Z.valueOf(b);
  }

  @Override
  public Z next() {
    if (mB == null) {
      if (mA == null) {
        mA = mInitA;
        return mInitA;
      }
      mB = mInitB;
    } else {
      final Z t = mB.square().divide(mA).add(1);
      mA = mB;
      mB = t;
    }
    return mB;
  }
}

