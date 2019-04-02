package irvine.oeis.a016;

import irvine.oeis.ContinuedFractionSequence;

/**
 * A016495 Continued fraction for log(67).
 * @author Sean A. Irvine
 */
public class A016495 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A016495() {
    super(new A016690());
  }
}
