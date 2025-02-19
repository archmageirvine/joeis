package irvine.oeis.a378;
// Generated by gen_seq4.pl 2025-01-03.ack/dirichcon2 at 2025-01-06 00:11

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.DirichletConvolutionSequence;
import irvine.oeis.a033.A033879;
import irvine.oeis.a346.A346248;

/**
 * A378755 Dirichlet convolution of A033879 and A346248.
 * @author Georg Fischer
 */
public class A378755 extends AbstractSequence {

  private final DirichletConvolutionSequence mSeq = new DirichletConvolutionSequence(new A033879(), 1, new A346248(), 1);

  /** Construct the sequence. */
  public A378755() {
    super(1);
  }

  @Override
  public Z next() {
    return mSeq.next();
  }
}
