package irvine.oeis.a016;

import irvine.oeis.ContinuedFractionSequence;

/**
 * A016498 Continued fraction for <code>log(70)</code>.
 * @author Sean A. Irvine
 */
public class A016498 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A016498() {
    super(new A016693());
  }
}
