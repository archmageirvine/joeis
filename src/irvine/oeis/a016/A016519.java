package irvine.oeis.a016;

import irvine.oeis.ContinuedFractionSequence;

/**
 * A016519 Continued fraction for <code>log(91)</code>.
 * @author Sean A. Irvine
 */
public class A016519 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A016519() {
    super(new A016714());
  }
}
