package irvine.oeis;

import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * Pisot L sequence.
 * @author Sean A. Irvine
 */
public class PisotLSequence extends AbstractSequence {

  private static final int DEFOFF = 0;
  private final Z mInitA;
  private final Z mInitB;
  private Z mA = null;
  private Z mB = null;
  private final Q mC;

  protected PisotLSequence(final long a, final long b, final Q constant) {
    super(DEFOFF);
    mInitA = Z.valueOf(a);
    mInitB = Z.valueOf(b);
    mC = constant;
  }

  protected PisotLSequence(final long a, final long b) {
    this(a, b, Q.ZERO);
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
      final Z t = new Q(mB.square(), mA).add(mC).ceiling();
      mA = mB;
      mB = t;
    }
    return mB;
  }
}

