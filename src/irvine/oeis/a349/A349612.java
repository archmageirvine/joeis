package irvine.oeis.a349;
// Generated by gen_seq4.pl dirichcon/dirichcon2 at 2023-03-26 00:32

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.DirichletConvolutionSequence;
import irvine.oeis.a325.A325126;
import irvine.oeis.a342.A342001;

/**
 * A349612 Dirichlet convolution of A342001 [{arithmetic derivative of n}/A003557(n)] with A325126 [Dirichlet inverse of rad(n)].
 * @author Georg Fischer
 */
public class A349612 extends AbstractSequence {

  private final DirichletConvolutionSequence mSeq = new DirichletConvolutionSequence(new A342001(), 1, new A325126(), 1);

  /** Construct the sequence. */
  public A349612() {
    super(1);
  }

  @Override
  public Z next() {
    return mSeq.next();
  }
}
