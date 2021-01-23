package irvine.oeis.a016;

import irvine.oeis.ContinuedFractionSequence;

/**
 * A016554 Continued fraction for log(53/2).
 * @author Sean A. Irvine
 */
public class A016554 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A016554() {
    super(new A016603());
  }
}
