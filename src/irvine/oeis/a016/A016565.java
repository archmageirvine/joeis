package irvine.oeis.a016;

import irvine.oeis.ContinuedFractionSequence;

/**
 * A016565 Continued fraction for <code>log(75/2)</code>.
 * @author Sean A. Irvine
 */
public class A016565 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A016565() {
    super(new A016614());
  }
}
