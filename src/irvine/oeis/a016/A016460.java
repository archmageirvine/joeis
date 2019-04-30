package irvine.oeis.a016;

import irvine.oeis.ContinuedFractionSequence;

/**
 * A016460 Continued fraction for <code>log(32)</code>.
 * @author Sean A. Irvine
 */
public class A016460 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A016460() {
    super(new A016655());
  }
}
