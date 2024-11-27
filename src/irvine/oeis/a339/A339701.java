package irvine.oeis.a339;

import irvine.math.dirichlet.Dgf;
import irvine.oeis.DirichletSequence;

/**
 * A339701 Dirichlet g.f.: Product_{k&gt;=2} (1 - k^(-s))^2.
 * @author Sean A. Irvine
 */
public class A339701 extends DirichletSequence {

  /** Construct the sequence. */
  public A339701() {
    super(Dgf.square(Dgf.xi()));
  }
}

