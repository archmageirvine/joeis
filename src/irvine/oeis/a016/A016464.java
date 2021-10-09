package irvine.oeis.a016;

import irvine.oeis.cons.ContinuedFractionSequence;

/**
 * A016464 Continued fraction for log(36).
 * @author Sean A. Irvine
 */
public class A016464 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A016464() {
    super(new A016659());
  }
}
