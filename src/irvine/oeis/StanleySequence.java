package irvine.oeis;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.memory.MemorySequence;

/**
 * A sequence containing no 3-term arithmetic progressions.
 * @author Sean A. Irvine
 */
public class StanleySequence extends MemorySequence {

  private final TreeSet<Z> mForbidden = new TreeSet<>();
  private Z mLast;
  private int mInitialTerms = 0;

  /**
   * Construct the sequence.
   * @param initialTerms initial terms
   */
  public StanleySequence(final Z... initialTerms) {
    mLast = initialTerms[initialTerms.length - 1];
    for (final Z v : initialTerms) {
      updateForbidden(v);
      add(v);
    }
    setOffset(1);
  }

  private void updateForbidden(final Z n) {
    final Z l2 = n.multiply2();
    for (final Z v : this) {
      mForbidden.add(l2.subtract(v));
    }
  }

  @Override
  protected Z computeNext() {
    do {
      mLast = mLast.add(1);
    } while (mForbidden.remove(mLast));
    // mLast is going to be the next term, update with new forbidden values
    updateForbidden(mLast);
    return mLast;
  }

  @Override
  public Z next() {
    return a(mInitialTerms++);
  }
}
