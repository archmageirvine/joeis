package irvine.oeis.a020;

import irvine.math.q.Q;
import irvine.oeis.PisotSequence;

/**
 * A020746 Pisot sequence T(3,7), a(n) = floor(a(n-1)^2/a(n-2)).
 * @author Sean A. Irvine
 */
public class A020746 extends PisotSequence {

  /** Construct the sequence. */
  public A020746() {
    super(3, 7, Q.ZERO);
  }
}

