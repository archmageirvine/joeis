package irvine.oeis.a385;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A385882 allocated for Clark Kimberling.
 * @author Sean A. Irvine
 */
public class A385882 extends Sequence1 {

  private final long mM;
  private final int mR;
  private final int mS;
  private final Z mMR;
  private long mU;
  private long mV;
  private Z mLeft;

  protected A385882(final long m, final int r, final int s) {
    mM = m;
    mR = r;
    mS = s;
    mMR = Z.valueOf(m).pow(r);
    mU = 1;
    mV = mM;
    mLeft = mMR.add(Z.valueOf(mU).pow(mS));
  }

  /** Construct the sequence. */
  public A385882() {
    this(1, 1, 3);
  }

  protected Z select(final long u, final long v, final Z w) {
    return Z.valueOf(v);
  }

  @Override
  public Z next() {
    while (true) {
      final Z vr = Z.valueOf(++mV).pow(mR);
      final Z t = mLeft.subtract(vr);
      if (t.signum() <= 0) {
        mLeft = mMR.add(Z.valueOf(++mU).pow(mS));
        mV = mM;
      } else {
        final Z w = t.root(mS);
        if (w.auxiliary() == 1) {
          return select(mU, mV, w);
        }
      }
    }
  }
}
