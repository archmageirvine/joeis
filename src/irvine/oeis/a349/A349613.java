package irvine.oeis.a349;
// manually at 2023-07-09 22:45

import irvine.oeis.DirichletConvolutionSequence;
import irvine.oeis.a064.A064413;
import irvine.oeis.a323.A323411;

/**
 * A349613 Dirichlet convolution of A064413 (EKG-permutation) with the Dirichlet inverse of its inverse permutation.
 * @author Georg Fischer
 */
public class A349613 extends DirichletConvolutionSequence {

  /** Construct the sequence. */
  public A349613() {
    super(new A323411(), 1, new A064413(), 1);
  }
}
