package irvine.oeis.a339;

import irvine.math.dirichlet.Dgf;
import irvine.oeis.DirichletSequence;

/**
 * A339716 Dirichlet g.f.: Product_{k&gt;=2} (1 - k^(-s))^9.
 * @author Sean A. Irvine
 */
public class A339716 extends DirichletSequence {

  /** Construct the sequence. */
  public A339716() {
    super(Dgf.pow(Dgf.xi(), 9));
  }
}

