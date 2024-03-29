package irvine.oeis.a349;
// Generated by gen_seq4.pl dirichcon/dirichcon2 at 2023-03-26 00:32

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.DirichletConvolutionSequence;
import irvine.oeis.a007.A007947;

/**
 * A349694 Dirichlet convolution of the squarefree kernel function (A007947) with itself.
 * @author Georg Fischer
 */
public class A349694 extends AbstractSequence {

  private final DirichletConvolutionSequence mSeq = new DirichletConvolutionSequence(new A007947(), 1, new A007947(), 1);

  /** Construct the sequence. */
  public A349694() {
    super(1);
  }

  @Override
  public Z next() {
    return mSeq.next();
  }
}
