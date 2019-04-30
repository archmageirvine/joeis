package irvine.oeis.a016;

import irvine.oeis.ContinuedFractionSequence;

/**
 * A016493 Continued fraction for <code>log(65)</code>.
 * @author Sean A. Irvine
 */
public class A016493 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A016493() {
    super(new A016688());
  }
}
