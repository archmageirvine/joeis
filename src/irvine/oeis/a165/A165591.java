package irvine.oeis.a165;
// Generated by gen_seq4.pl anopan 

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a011.A011626;

/**
 * A165591 Jacobi symbol (n,59701).
 * @author Georg Fischer
 */
public class A165591 extends AbstractSequence {

  private final A011626 mSeq1 = new A011626();
  private final A165574 mSeq2 = new A165574();

  /** Construct the sequence. */
  public A165591() {
    super(0);
  }

  @Override
  public Z next() {
    return mSeq1.next().multiply(mSeq2.next());
  }
}
