package irvine.oeis.a390;

import irvine.math.z.Z;
import irvine.oeis.a385.A385240;

/**
 * A390265 allocated for Janaka Rodrigo.
 * @author Sean A. Irvine
 */
public class A390265 extends A385240 {

  private int mN = -1;
  private int mM = 0;
  private int mMinDefect = Integer.MAX_VALUE;

  /** Construct the sequence. */
  public A390265() {
    super(4);
  }

  @Override
  protected void process(final int[] set) {
    final int defect = getDefect(set);
    synchronized (A390265.this) {
      if (defect < mMinDefect) {
        mMinDefect = defect;
      }
    }
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    mMinDefect = Integer.MAX_VALUE;
    t(mM + 4, mN - mM + 2);
    return mMinDefect == Integer.MAX_VALUE ? Z.ZERO : Z.valueOf(mMinDefect);
  }
}

