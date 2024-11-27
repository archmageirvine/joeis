package irvine.oeis.a114;

import irvine.math.dirichlet.Dgf;
import irvine.oeis.DirichletSequence;

/**
 * A370239.
 * @author Sean A. Irvine
 */
public class A114592 extends DirichletSequence {

  /** Construct the sequence. */
  public A114592() {
    super(Dgf.xi());
  }
}

