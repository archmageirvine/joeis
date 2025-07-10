package irvine.oeis.a385;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A385182 allocated for Clark Kimberling.
 * @author Sean A. Irvine
 */
public class A385182 extends Sequence1 {

  private final long mM;
  private long mU;
  private long mV;

  protected A385182(final long m) {
    mM = m;
    mU = m;
    mV = mM + 1;
  }

  /** Construct the sequence. */
  public A385182() {
    this(1);
  }

  protected Z select(final long u, final long v, final long w) {
    //System.out.println("(" + mM + "," + u + "," + v + "," + w + ")");
    return Z.valueOf(u);
  }

  @Override
  public Z next() {
    while (true) {
      if (++mV * mV >= mM * (mU + mM)) {
        ++mU;
        mV = mM + 1;
      }
      if ((mM * (mM + mU)) % mV == 0) {
        final long w = (mM * (mM + mU)) / mV - mV;
        if (w > 0) {
          return select(mU, mV, w);
        }
      }
    }
  }
}
