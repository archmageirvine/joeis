package irvine.oeis.a016;

import irvine.oeis.cons.ContinuedFractionSequence;

/**
 * A016496 Continued fraction for log(68).
 * @author Sean A. Irvine
 */
public class A016496 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A016496() {
    super(1, new A016691());
  }
}
