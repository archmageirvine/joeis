package irvine.oeis.a016;

import irvine.oeis.cons.ContinuedFractionSequence;

/**
 * A016460 Continued fraction for log(32).
 * @author Sean A. Irvine
 */
public class A016460 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A016460() {
    super(new A016655());
  }
}
