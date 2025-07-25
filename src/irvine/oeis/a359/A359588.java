package irvine.oeis.a359;
// Generated by gen_seq4.pl 2025-06-16.ack/dirichinv at 2025-06-16 21:55

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.DirichletInverseSequence;
import irvine.oeis.a083.A083346;

/**
 * A359588 Dirichlet inverse of A083346.
 * @author Georg Fischer
 */
public class A359588 extends AbstractSequence {

  private final DirichletInverseSequence mSeq = new DirichletInverseSequence(new A083346());

  /** Construct the sequence. */
  public A359588() {
    super(1);
  }

  @Override
  public Z next() {
    return mSeq.next();
  }
}
