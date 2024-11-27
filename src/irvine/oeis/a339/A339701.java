package irvine.oeis.a339;

import irvine.math.dirichlet.Dgf;
import irvine.oeis.DirichletSequence;

/**
 * A370239 The sum of divisors of n that are squares of squarefree numbers.
 * @author Sean A. Irvine
 */
public class A339701 extends DirichletSequence {

  /** Construct the sequence. */
  public A339701() {
    super(Dgf.square(Dgf.xi()));
  }
}

