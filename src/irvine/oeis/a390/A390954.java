package irvine.oeis.a390;

import irvine.oeis.DirichletConvolutionSequence;
import irvine.oeis.a328.A328254;

/**
 * A390954 Dirichlet convolution of A390554 and A328254.
 * @author Sean A. Irvine
 */
public class A390954 extends DirichletConvolutionSequence {

  /** Construct the sequence. */
  public A390954() {
    super(1, new A390554(), 1, new A328254(), 1);
  }
}
