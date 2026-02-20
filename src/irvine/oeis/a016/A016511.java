package irvine.oeis.a016;

import irvine.oeis.cons.ContinuedFractionSequence;

/**
 * A016511 Continued fraction for log(83).
 * @author Sean A. Irvine
 */
public class A016511 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A016511() {
    super(1, new A016706());
  }
}
