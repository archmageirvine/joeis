package irvine.oeis.a386;

import irvine.math.z.Z;

/**
 * A386297 Array read by antidiagonals T(n,k) is the minimal defect across all partitions of an n X n X n cube into k noncongruent cuboids, or 0 if there is no such partition.
 * @author Sean A. Irvine
 */
public class A386297 extends A386296 {

  private long mMinDefect = 0;
  private int mN = 3;
  private int mM = 0;

  /** Construct the sequence. */
  public A386297() {
    super(3);
  }

  @Override
  protected boolean accept(final int[] set) {
    final long defect = getDefect(set);
    synchronized (A386297.this) {
      return defect < mMinDefect;
    }
  }

  @Override
  protected void process(final int[] set) {
    final long defect = getDefect(set);
    synchronized (A386297.this) {
      if (defect < mMinDefect) { // recheck in case another thread changed in interim
        mMinDefect = defect;
      }
    }
  }

  @Override
  public Z next() {
    if (++mM + 1 >= mN) {
      ++mN;
      mM = 1;
    }
    mMinDefect = Integer.MAX_VALUE;
    t(mM + 2, mN - mM);
    return mMinDefect == Integer.MAX_VALUE ? Z.ZERO : Z.valueOf(mMinDefect);
  }
}

