package irvine.math.predicate;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000396;

/**
 * Test if a number is perfect.
 * @author Sean A. Irvine
 */
class Perfect extends AbstractPredicate {

  // Deliberate lazy instantiation
  private TreeSet<Z> mPerfect = null;
  private Sequence mPerfectSeq = null;

  @Override
  public boolean is(final Z n) {
    if (mPerfect == null) {
      mPerfect = new TreeSet<>();
      mPerfectSeq = new A000396();
      mPerfect.add(mPerfectSeq.next());
    }
    while (mPerfect.last().compareTo(n) < 0) {
      mPerfect.add(mPerfectSeq.next());
    }
    return mPerfect.contains(n);
  }
}
