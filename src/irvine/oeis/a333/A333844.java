package irvine.oeis.a333;

import irvine.math.dirichlet.Dgf;
import irvine.oeis.DirichletSequence;

/**
 * A333844 G.f.: Sum_{k&gt;=1} k * x^(k^4) / (1 - x^(k^4)).
 * @author Sean A. Irvine
 */
public class A333844 extends DirichletSequence {

  /** Construct the sequence. */
  public A333844() {
    super(Dgf.multiply(Dgf.zeta(4, 1), Dgf.zeta()));
  }
}

