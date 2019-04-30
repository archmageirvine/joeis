package irvine.oeis.a016;

import irvine.oeis.ContinuedFractionSequence;

/**
 * A016456 Continued fraction for <code>log(28)</code>.
 * @author Sean A. Irvine
 */
public class A016456 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A016456() {
    super(new A016651());
  }
}
