package irvine.oeis.a307;
// manually modified; dirichcon at 2021-04-24 14:59

import irvine.oeis.DirichletConvolutionSequence;
import irvine.oeis.a008.A008683;
import irvine.oeis.a271.A271102;

/**
 * A307445 Dirichlet g.f.: 1 / (zeta(s) * zeta(2*s)).
 * @author Georg Fischer
 */
public class A307445 extends DirichletConvolutionSequence {

  /** Construct the sequence. */
  public A307445() {
    super(new A008683(), 1, new A271102(), 1);
  }
}
