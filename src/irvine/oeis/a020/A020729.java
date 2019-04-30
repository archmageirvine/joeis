package irvine.oeis.a020;

import irvine.math.q.Q;
import irvine.oeis.PisotSequence;

/**
 * A020729 Pisot sequences <code>E(2,10), L(2,10), P(2,10), T(2,10)</code>.
 * @author Sean A. Irvine
 */
public class A020729 extends PisotSequence {

  /** Construct the sequence. */
  public A020729() {
    super(2, 10, Q.ZERO);
  }
}

