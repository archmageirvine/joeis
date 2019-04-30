package irvine.oeis.a016;

import irvine.oeis.ContinuedFractionSequence;

/**
 * A016537 Continued fraction for <code>log(19/2)</code>.
 * @author Sean A. Irvine
 */
public class A016537 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A016537() {
    super(new A016586());
  }
}
