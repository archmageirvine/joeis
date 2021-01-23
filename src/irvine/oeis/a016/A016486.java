package irvine.oeis.a016;

import irvine.oeis.ContinuedFractionSequence;

/**
 * A016486 Continued fraction for log(58).
 * @author Sean A. Irvine
 */
public class A016486 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A016486() {
    super(new A016681());
  }
}
