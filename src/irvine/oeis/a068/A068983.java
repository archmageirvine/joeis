package irvine.oeis.a068;
// manually anopan 0,0

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a003.A003422;
import irvine.oeis.a062.A062970;

/**
 * A068983 a(n) = Sum_{k=0..n} (k^k-k!).
 * @author Georg Fischer
 */
public class A068983 extends AbstractSequence {

  private final A062970 mSeq1 = new A062970();
  private final A003422 mSeq2 = new A003422();

  /** Construct the sequence. */
  public A068983() {
    super(1);
    mSeq1.next();
    mSeq2.next();
    mSeq2.next();
  }

  @Override
  public Z next() {
    return mSeq1.next().subtract(mSeq2.next());
  }
}
