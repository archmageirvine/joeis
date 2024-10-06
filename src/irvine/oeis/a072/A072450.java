package irvine.oeis.a072;

import irvine.oeis.cons.ContinuedFractionSequence;

/**
 * A072450 Continued fraction expansion of the limit of a nested radical, sqrt(1 + sqrt(2 + sqrt(3 + sqrt(4 + ... )))).
 * @author Sean A. Irvine
 */
public class A072450 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A072450() {
    super(0, new A072449());
  }
}

