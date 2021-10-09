package irvine.oeis.a016;

import irvine.oeis.cons.ContinuedFractionSequence;

/**
 * A016481 Continued fraction for log(53).
 * @author Sean A. Irvine
 */
public class A016481 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A016481() {
    super(new A016676());
  }
}
