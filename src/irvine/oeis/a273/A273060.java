package irvine.oeis.a273;
// Generated by gen_seq4.pl anopan 

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a000.A000010;
import irvine.oeis.a048.A048855;

/**
 * A273060 a(n) = phi(n!)/phi(n).
 * @author Georg Fischer
 */
public class A273060 extends AbstractSequence {

  private final A048855 mSeq1 = new A048855();
  private final A000010 mSeq2 = new A000010();

  /** Construct the sequence. */
  public A273060() {
    super(1);
    mSeq1.next();
  }

  @Override
  public Z next() {
    return mSeq1.next().divide(mSeq2.next());
  }
}
