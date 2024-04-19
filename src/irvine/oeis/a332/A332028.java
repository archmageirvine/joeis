package irvine.oeis.a332;
// manually anopan 

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a002.A002024;
import irvine.oeis.a060.A060432;

/**
 * A332028 Savannah problem: number of distinct possible populations after n weeks, not allowing new populations after the empty set.
 * @author Georg Fischer
 */
public class A332028 extends AbstractSequence {

  private int mN = 0;
  private final A060432 mSeq1 = new A060432();
  private final A002024 mSeq2 = new A002024();

  /** Construct the sequence. */
  public A332028() {
    super(1);
  }

  @Override
  public Z next() {
    ++mN;
    final Z result = mSeq1.next().add(mSeq2.next());
    return (mN == 1) ? Z.THREE : result;
  }
}
