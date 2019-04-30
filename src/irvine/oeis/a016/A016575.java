package irvine.oeis.a016;

import irvine.oeis.ContinuedFractionSequence;

/**
 * A016575 Continued fraction for <code>log(95/2)</code>.
 * @author Sean A. Irvine
 */
public class A016575 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A016575() {
    super(new A016624());
  }
}
