package irvine.oeis.a016;

import irvine.oeis.ContinuedFractionSequence;

/**
 * A016500 Continued fraction for log(72).
 * @author Sean A. Irvine
 */
public class A016500 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A016500() {
    super(new A016695());
  }
}
