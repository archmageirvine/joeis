package irvine.oeis.a390;

import irvine.math.z.Z;
import irvine.oeis.a385.A385240;

/**
 * A390007 allocated for Janaka Rodrigo.
 * @author Sean A. Irvine
 */
public class A390007 extends A385240 {

  private int mN = 0;
  private int mMinDefect = Integer.MAX_VALUE;

  @Override
  protected void process(final int[] set) {
    final int defect = getDefect(set);
    synchronized (A390007.this) {
      if (defect < mMinDefect) {
        mMinDefect = defect;
      }
    }
  }

  @Override
  public Z next() {
    mMinDefect = Integer.MAX_VALUE;
    t(++mN, 3);
    return mMinDefect == Integer.MAX_VALUE ? Z.ZERO : Z.valueOf(mMinDefect);
  }
}

