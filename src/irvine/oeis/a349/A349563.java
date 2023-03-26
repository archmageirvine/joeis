package irvine.oeis.a349;
// manually dirichcon/dirichcin at 2023-03-25 23:17

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.DirichletConvolutionSequence;
import irvine.oeis.a000.A000108;

/**
 * A349563 Dirichlet convolution of right-shifted Catalan numbers with A349452 (Dirichlet inverse of A011782, 2^(n-1)).
 * @author Georg Fischer
 */
public class A349563 extends AbstractSequence {

  private final DirichletConvolutionSequence mSeq = new DirichletConvolutionSequence(new A000108(), 1, new A349452(), 1);

  /** Construct the sequence. */
  public A349563() {
    super(1);
  }

  @Override
  public Z next() {
    return mSeq.next();
  }
}
