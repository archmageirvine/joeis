package irvine.oeis.a339;
// manually 2024-03-08

import irvine.oeis.DirichletConvolutionSequence;
import irvine.oeis.a045.A045778;
import irvine.oeis.a328.A328706;

/**
 * A339335 Dirichlet g.f.: Product_{k&gt;=2} (1 + k^(-s))^3.
 * @author Georg Fischer
 */
public class A339335 extends DirichletConvolutionSequence {

  /** Construct the sequence. */
  public A339335() {
    super(1, new A328706(), 1, new A045778(), 1);
  }
}
