package irvine.oeis.a016;

import irvine.oeis.cons.ContinuedFractionSequence;

/**
 * A016450 Continued fraction for log(22).
 * @author Sean A. Irvine
 */
public class A016450 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A016450() {
    super(new A016645());
  }
}
