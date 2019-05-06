package irvine.oeis.a021;

import irvine.math.q.Q;
import irvine.oeis.PisotLSequence;

/**
 * A021001.
 * @author Sean A. Irvine
 */
public class A021001 extends PisotLSequence {

  /** Construct the sequence. */
  public A021001() {
    super(2, 9, Q.HALF.negate());
  }
}

