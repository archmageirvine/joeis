package irvine.oeis.a016;

import irvine.oeis.ContinuedFractionSequence;

/**
 * A016531 Continued fraction for <code>log(7/2)</code>.
 * @author Sean A. Irvine
 */
public class A016531 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A016531() {
    super(new A016580());
  }
}
