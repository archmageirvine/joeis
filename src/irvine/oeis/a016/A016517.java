package irvine.oeis.a016;

import irvine.oeis.cons.ContinuedFractionSequence;

/**
 * A016517 Continued fraction for log(89).
 * @author Sean A. Irvine
 */
public class A016517 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A016517() {
    super(new A016712());
  }
}
