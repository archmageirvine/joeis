package irvine.oeis.a016;

import irvine.oeis.ContinuedFractionSequence;

/**
 * A016469 Continued fraction for log(41).
 * @author Sean A. Irvine
 */
public class A016469 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A016469() {
    super(new A016664());
  }
}
