package irvine.oeis.a323;
// Generated by gen_seq4.pl dirichcon/dirichcon2 at 2023-03-26 00:32

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.DirichletConvolutionSequence;
import irvine.oeis.a000.A000203;
import irvine.oeis.a001.A001221;

/**
 * A323600 Dirichlet convolution of sigma with omega.
 * @author Georg Fischer
 */
public class A323600 extends AbstractSequence {

  private final DirichletConvolutionSequence mSeq = new DirichletConvolutionSequence(new A000203(), 1, new A001221(), 1);

  /** Construct the sequence. */
  public A323600() {
    super(1);
  }

  @Override
  public Z next() {
    return mSeq.next();
  }
}
