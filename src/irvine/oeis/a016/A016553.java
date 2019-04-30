package irvine.oeis.a016;

import irvine.oeis.ContinuedFractionSequence;

/**
 * A016553 Continued fraction for <code>log(51/2)</code>.
 * @author Sean A. Irvine
 */
public class A016553 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A016553() {
    super(new A016602());
  }
}
