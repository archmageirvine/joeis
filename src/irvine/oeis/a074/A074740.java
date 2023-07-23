package irvine.oeis.a074;
// manually anopan 1,0

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a002.A002866;
import irvine.oeis.a066.A066843;

/**
 * A074740 a(n) = n!*2^(n-1)/Product_{k=1..n} tau(k) where tau = A000005.
 * @author Georg Fischer
 */
public class A074740 extends AbstractSequence {

  private final A066843 mSeq1 = new A066843();
  private final A002866 mSeq2 = new A002866();

  /** Construct the sequence. */
  public A074740() {
    super(1);
    mSeq1.next();
    mSeq2.next();
  }

  @Override
  public Z next() {
    return mSeq2.next().divide(mSeq1.next());
  }
}
