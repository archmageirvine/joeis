package irvine.oeis.a385;

import irvine.math.z.Z;
import irvine.oeis.a386.A386296;

/**
 * A385154 a(n) is the least possible difference between the largest and smallest volumes of distinct five-cuboid combinations filling an n X n X n cube.
 * @author Sean A. Irvine
 */
public class A385154 extends A386296 {

  private long mMinDefect = 0;
  private int mN = 2;

  /** Construct the sequence. */
  public A385154() {
    super(3);
  }

  @Override
  protected boolean accept(final int[] set) {
    final long defect = getDefect(set);
    synchronized (A385154.this) {
      return defect < mMinDefect;
    }
  }

  @Override
  protected void process(final int[] set) {
    final long defect = getDefect(set);
    synchronized (A385154.this) {
      if (defect < mMinDefect) { // recheck in case another thread changed in interim
        mMinDefect = defect;
      }
    }
  }

  @Override
  public Z next() {
    mMinDefect = Integer.MAX_VALUE;
    t(++mN, 5);
    return Z.valueOf(mMinDefect);
  }
}

