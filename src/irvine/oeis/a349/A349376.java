package irvine.oeis.a349;
// manually dirichcon/dirichcin at 2023-03-25 19:35

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.DirichletConvolutionSequence;
import irvine.oeis.a006.A006368;

/**
 * A349376 Dirichlet convolution of A006368 with the Dirichlet inverse of A006369, where A006368 is the "amusical permutation", and A006369 is its inverse permutation.
 * @author Georg Fischer
 */
public class A349376 extends AbstractSequence {

  private final DirichletConvolutionSequence mSeq = new DirichletConvolutionSequence(new A006368(), 0, new A349368(), 1);

  /** Construct the sequence. */
  public A349376() {
    super(1);
  }

  @Override
  public Z next() {
    return mSeq.next();
  }
}
