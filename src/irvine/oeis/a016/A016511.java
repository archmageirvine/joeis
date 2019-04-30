package irvine.oeis.a016;

import irvine.oeis.ContinuedFractionSequence;

/**
 * A016511 Continued fraction for <code>log(83)</code>.
 * @author Sean A. Irvine
 */
public class A016511 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A016511() {
    super(new A016706());
  }
}
