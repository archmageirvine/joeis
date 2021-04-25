package irvine.oeis.a251;
// manually modified; dirichcon at 2021-04-24 14:59

import irvine.oeis.DirichletConvolutionSequence;
import irvine.oeis.a001.A001764;
import irvine.oeis.a008.A008683;

/**
 * A251662 Dirichlet convolution of Moebius function mu(n) (A008683) with Ternary numbers A001764.
 * @author Georg Fischer
 */
public class A251662 extends DirichletConvolutionSequence {

  /** Construct the sequence. */
  public A251662() {
    super(new A008683(), 1, new A001764(), 1); // offset(A001764) should be 1 
    mSeq2.next();
  }
}
