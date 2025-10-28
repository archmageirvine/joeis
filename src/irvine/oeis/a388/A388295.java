package irvine.oeis.a388;

import irvine.math.z.Z;
import irvine.oeis.a385.A385240;

/**
 * A388295 a(n) is the least possible difference between the areas of the largest and smallest rectangles in a 4 element set of distinct integer sided rectangles filling an n X n square.
 * @author Sean A. Irvine
 */
public class A388295 extends A385240 {

  private int mN = 3;
  private int mMinDefect = Integer.MAX_VALUE;

  /** Construct the sequence. */
  public A388295() {
    super(4);
  }

  @Override
  protected void process(final int[] set) {
    final int defect = getDefect(set);
    synchronized (A388295.this) {
      if (defect < mMinDefect) {
        mMinDefect = defect;
      }
    }
  }

  @Override
  public Z next() {
    mMinDefect = Integer.MAX_VALUE;
    t(++mN, 4);
    return mMinDefect == Integer.MAX_VALUE ? Z.ZERO : Z.valueOf(mMinDefect);
  }
}

