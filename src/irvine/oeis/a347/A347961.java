package irvine.oeis.a347;
// Generated by gen_seq4.pl dirichcon/dirichcon2 at 2023-03-26 00:32

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.DirichletConvolutionSequence;
import irvine.oeis.a342.A342001;

/**
 * A347961 Dirichlet convolution of A342001 with itself.
 * @author Georg Fischer
 */
public class A347961 extends AbstractSequence {

  private final DirichletConvolutionSequence mSeq = new DirichletConvolutionSequence(new A342001(), 1, new A342001(), 1);

  /** Construct the sequence. */
  public A347961() {
    super(1);
  }

  @Override
  public Z next() {
    return mSeq.next();
  }
}
