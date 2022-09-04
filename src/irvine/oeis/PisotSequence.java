package irvine.oeis;

import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * Pisot sequence.
 * @author Sean A. Irvine
 */
public class PisotSequence implements SequenceWithOffset {

  private final Z mInitA;
  private final Z mInitB;
  private Z mA = null;
  private Z mB = null;
  private final Q mC;
  protected int mOffset = 0;

  protected PisotSequence(final long a, final long b, final Q constant) {
    mInitA = Z.valueOf(a);
    mInitB = Z.valueOf(b);
    mC = constant;
  }

  protected PisotSequence(final long a, final long b) {
    this(a, b, Q.HALF);
  }

  @Override
  public int getOffset() {
    return mOffset;
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
      final Z t = new Q(mB.square(), mA).add(mC).toZ();
      mA = mB;
      mB = t;
    }
    return mB;
  }
}

