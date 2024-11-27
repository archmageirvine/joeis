package irvine.oeis.a114;

import irvine.math.dirichlet.Dgf;
import irvine.oeis.DirichletSequence;

/**
 * A114592 Sum_{n&gt;=1} a(n)/n^s = Product_{k&gt;=2} (1 - 1/k^s).
 * @author Sean A. Irvine
 */
public class A114592 extends DirichletSequence {

  /** Construct the sequence. */
  public A114592() {
    super(Dgf.xi());
  }
}

