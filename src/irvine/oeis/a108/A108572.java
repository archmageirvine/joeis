package irvine.oeis.a108;
// manually knestm/knest at 2023-03-02 16:06

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a018.A018783;

/**
 * A108572 Number of partitions of n which, as multisets, are nontrivial repetitions of a multiset.
 * @author Georg Fischer
 */
public class A108572 extends AbstractSequence {

  private final A018783 mSeq1 = new A018783();

  /** Construct the sequence. */
  public A108572() {
    super(1);
  }

  private int mN = 0;

  {
    mSeq1.next();
  }

  @Override
  public Z next() {
    final Z t = mSeq1.next().subtract(1);
    return (++mN == 1) ? Z.ZERO : t;
  }
}
