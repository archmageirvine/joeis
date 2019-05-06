package irvine.oeis.a021;

import irvine.math.q.Q;
import irvine.oeis.PisotLSequence;

/**
 * A021004 Pisot sequence <code>P(4,10)</code>.
 * @author Sean A. Irvine
 */
public class A021004 extends PisotLSequence {

  /** Construct the sequence. */
  public A021004() {
    super(4, 10, Q.HALF.negate());
  }
}

