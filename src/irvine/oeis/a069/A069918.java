package irvine.oeis.a069;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a063.A063867;

/**
 * A069918 Number of ways of partitioning the set {1...n} into two subsets whose sums are as nearly equal as possible.
 * @author Georg Fischer
 */
public class A069918 extends Sequence1 {

  private final AbstractSequence mSeq = new A063867().skip(1);

  @Override
  public Z next() {
    return mSeq.next().divide2();
  }
}
