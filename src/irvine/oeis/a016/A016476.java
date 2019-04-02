package irvine.oeis.a016;

import irvine.oeis.ContinuedFractionSequence;

/**
 * A016476 Continued fraction for log(48).
 * @author Sean A. Irvine
 */
public class A016476 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A016476() {
    super(new A016671());
  }
}
