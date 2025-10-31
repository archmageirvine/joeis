package irvine.oeis.a390;

import irvine.math.z.Z;
import irvine.oeis.a385.A385240;

/**
 * A390007 a(n) is the least possible difference between the areas of the largest and smallest rectangles in a 3 element set of distinct integer sided rectangles filling an n X n square.
 * @author Sean A. Irvine
 */
public class A390007 extends A385240 {

  private int mN = 2;
  private int mMinDefect = Integer.MAX_VALUE;

  /** Construct the sequence. */
  public A390007() {
    super(3);
  }

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

