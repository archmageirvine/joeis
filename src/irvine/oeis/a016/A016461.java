package irvine.oeis.a016;

import irvine.oeis.ContinuedFractionSequence;

/**
 * A016461 Continued fraction for <code>log(33)</code>.
 * @author Sean A. Irvine
 */
public class A016461 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A016461() {
    super(new A016656());
  }
}
