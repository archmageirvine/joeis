package irvine.oeis.a016;

import irvine.oeis.ContinuedFractionSequence;

/**
 * A016494 Continued fraction for log(66).
 * @author Sean A. Irvine
 */
public class A016494 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A016494() {
    super(new A016689());
  }
}
