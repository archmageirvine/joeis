package irvine.oeis.a016;

import irvine.oeis.cons.ContinuedFractionSequence;

/**
 * A016489 Continued fraction for log(61).
 * @author Sean A. Irvine
 */
public class A016489 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A016489() {
    super(new A016684());
  }
}
