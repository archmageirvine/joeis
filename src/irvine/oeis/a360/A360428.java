package irvine.oeis.a360;
// manually dirichcon2 at 2023-06-04 20:45

import irvine.oeis.DirichletConvolutionSequence;
import irvine.oeis.a008.A008683;
import irvine.oeis.a034.A034714;

/**
 * A360428 Inverse Mobius transformation of A338164.
 * @author Georg Fischer
 */
public class A360428 extends DirichletConvolutionSequence {

  /** Construct the sequence. */
  public A360428() {
    super(new A034714(), 1, new A008683(), 1);
  }
}
