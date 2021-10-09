package irvine.oeis.a016;

import irvine.oeis.cons.ContinuedFractionSequence;

/**
 * A016556 Continued fraction for log(57/2).
 * @author Sean A. Irvine
 */
public class A016556 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A016556() {
    super(new A016605());
  }
}
