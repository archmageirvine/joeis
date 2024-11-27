package irvine.oeis.a369;

import irvine.math.dirichlet.Dgf;
import irvine.oeis.DirichletSequence;

/**
 * A369308 The number of square divisors d of n such that n/d is also a square.
 * @author Sean A. Irvine
 */
public class A369308 extends DirichletSequence {

  /** Construct the sequence. */
  public A369308() {
    super(Dgf.square(Dgf.zeta(2)));
  }
}

