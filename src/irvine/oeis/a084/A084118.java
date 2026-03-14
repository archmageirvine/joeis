package irvine.oeis.a084;

import irvine.oeis.a083.A083864;
import irvine.oeis.cons.ContinuedFractionSequence;

/**
 * A084118 Continued fraction expansion of Product_{k&gt;=0} (1 - 1/(2^k+1)).
 * @author Sean A. Irvine
 */
public class A084118 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A084118() {
    super(0, new A083864());
  }
}

