package irvine.oeis.a016;

import irvine.oeis.ContinuedFractionSequence;

/**
 * A016540 Continued fraction for log(25/2).
 * @author Sean A. Irvine
 */
public class A016540 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A016540() {
    super(new A016589());
  }
}
