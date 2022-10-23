package irvine.oeis.a266;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A266279 Nonnegative integers where all occurring digits occur with equal frequency.
 * @author Georg Fischer
 */
public class A266279 extends Sequence1 {

  protected int mM;
  protected int mBase;

  /** Construct the sequence. */
  public A266279() {
    this(10);
  }

  /**
   * Generic constructor with parameters
   * @param base base to use
   */
  public A266279(final int base) {
    mBase = base;
    mM = -1;
  }

  @Override
  public Z next() {
    while (true) {
      ++mM;
      final int[] counts = ZUtils.digitCounts(mM, mBase);
      int first = -1;
      boolean same = true; // assume success
      int idig = 0;
      while (same && idig < mBase) {
        final int count = counts[idig];
        if (count != 0) {
          if (first < 0) {
            first = count;
          } else if (first != count) {
            same = false;
          }
        }
        ++idig;
      }
      if (same) {
        return Z.valueOf(mM);
      }
    }
  }
}
