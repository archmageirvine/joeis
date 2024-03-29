package irvine.oeis.a287;
// Generated by gen_seq4.pl anopan 

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a001.A001511;
import irvine.oeis.a002.A002487;

/**
 * A287896 a(n) = A002487(n)*A001511(n).
 * @author Georg Fischer
 */
public class A287896 extends AbstractSequence {

  private A002487 mSeq1 = new A002487();
  private A001511 mSeq2 = new A001511();

  /** Construct the sequence. */
  public A287896() {
    super(1);
    mSeq1.next();
  }

  @Override
  public Z next() {
    return mSeq1.next().multiply(mSeq2.next());
  }
}
