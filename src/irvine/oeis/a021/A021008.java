package irvine.oeis.a021;

import irvine.math.q.Q;
import irvine.oeis.PisotLSequence;

/**
 * A021008.
 * @author Sean A. Irvine
 */
public class A021008 extends PisotLSequence {

  /** Construct the sequence. */
  public A021008() {
    super(5, 11, Q.HALF.negate());
  }
}

