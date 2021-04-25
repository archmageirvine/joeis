package irvine.oeis.a307;
// manually modified; dirichcon at 2021-04-24 14:59

import irvine.oeis.DirichletConvolutionSequence;
import irvine.oeis.a212.A212793;
import irvine.oeis.a271.A271102;

/**
 * A307425 Dirichlet g.f.: zeta(s) / (zeta(2*s) * zeta(3*s)).
 * @author Georg Fischer
 */
public class A307425 extends DirichletConvolutionSequence {

  /** Construct the sequence. */
  public A307425() {
    super(new A212793(), 1, new A271102(), 1);
  }
}
