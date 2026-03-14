package irvine.oeis.a084;

import irvine.oeis.a085.A085011;
import irvine.oeis.cons.ContinuedFractionSequence;

/**
 * A084129 Continued fraction expansion of 4*Product_{k&gt;=0} (1 - 1/(2^k+1)).
 * @author Sean A. Irvine
 */
public class A084129 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A084129() {
    super(0, new A085011());
  }
}

