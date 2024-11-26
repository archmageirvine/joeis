package irvine.oeis.a370;

import irvine.math.dirichlet.Dgf;
import irvine.oeis.DirichletSequence;

/**
 * A370239 The sum of divisors of n that are squares of squarefree numbers.
 * @author Sean A. Irvine
 */
public class A370239 extends DirichletSequence {

  /** Construct the sequence. */
  public A370239() {
    super(Dgf.multiply(Dgf.multiply(Dgf.zeta(), Dgf.zeta(2, 2)), Dgf.inverseZeta(4, 4)));
  }
}

