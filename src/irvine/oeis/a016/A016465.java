package irvine.oeis.a016;

import irvine.oeis.ContinuedFractionSequence;

/**
 * A016465 Continued fraction for <code>log(37)</code>.
 * @author Sean A. Irvine
 */
public class A016465 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A016465() {
    super(new A016660());
  }
}
