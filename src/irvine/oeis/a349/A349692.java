package irvine.oeis.a349;
// Generated by gen_seq4.pl dirichcon/dirichcon2 at 2023-03-26 00:32

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.DirichletConvolutionSequence;
import irvine.oeis.a018.A018804;

/**
 * A349692 Dirichlet convolution of the gcd-sum function (A018804) with itself.
 * @author Georg Fischer
 */
public class A349692 extends AbstractSequence {

  private final DirichletConvolutionSequence mSeq = new DirichletConvolutionSequence(new A018804(), 1, new A018804(), 1);

  /** Construct the sequence. */
  public A349692() {
    super(1);
  }

  @Override
  public Z next() {
    return mSeq.next();
  }
}
