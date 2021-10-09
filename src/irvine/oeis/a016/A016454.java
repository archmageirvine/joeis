package irvine.oeis.a016;

import irvine.oeis.cons.ContinuedFractionSequence;

/**
 * A016454 Continued fraction for log(26).
 * @author Sean A. Irvine
 */
public class A016454 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A016454() {
    super(new A016649());
  }
}
