package irvine.oeis.a349;
// manually dirichcon/dirichcin at 2023-03-25 20:44

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.DirichletConvolutionSequence;
import irvine.oeis.a011.A011782;

/**
 * A349568 Dirichlet convolution of A011782 [2^(n-1)] with A349453 (Dirichlet inverse of A133494, 3^(n-1)).
 * @author Georg Fischer
 */
public class A349568 extends AbstractSequence {

  private final DirichletConvolutionSequence mSeq = new DirichletConvolutionSequence(new A011782(), 0, new A349453(), 1);

  /** Construct the sequence. */
  public A349568() {
    super(1);
  }

  @Override
  public Z next() {
    return mSeq.next();
  }
}
