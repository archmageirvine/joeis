package irvine.oeis.a378;
// Generated by gen_seq4.pl 2025-07-26.ack/dirichcon2 at 2025-07-26 21:09

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.DirichletConvolutionSequence;
import irvine.oeis.a323.A323910;

/**
 * A378533 Dirichlet convolution of A323910 and A378542.
 * @author Georg Fischer
 */
public class A378533 extends AbstractSequence {

  private final DirichletConvolutionSequence mSeq = new DirichletConvolutionSequence(new A323910(), 1, new A378542(), 1);

  /** Construct the sequence. */
  public A378533() {
    super(1);
  }

  @Override
  public Z next() {
    return mSeq.next();
  }
}
