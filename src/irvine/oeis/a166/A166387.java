package irvine.oeis.a166;
// Generated by gen_seq4.pl anopan 

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a128.A128422;

/**
 * A166387 a(n) = sum (floor (j^2/n), 1 &lt;= j &lt;= n-1) - floor ((n-1)(n-2)/3), n &gt;= 2.
 * @author Georg Fischer
 */
public class A166387 extends AbstractSequence {

  private final A166375 mSeq1 = new A166375();
  private final A128422 mSeq2 = new A128422();

  /** Construct the sequence. */
  public A166387() {
    super(2);
    mSeq2.next();
  }

  @Override
  public Z next() {
    return mSeq1.next().subtract(mSeq2.next());
  }
}
