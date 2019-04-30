package irvine.oeis.a016;

import irvine.oeis.ContinuedFractionSequence;

/**
 * A016496 Continued fraction for <code>log(68)</code>.
 * @author Sean A. Irvine
 */
public class A016496 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A016496() {
    super(new A016691());
  }
}
