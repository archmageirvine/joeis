package irvine.oeis.a016;

import irvine.oeis.ContinuedFractionSequence;

/**
 * A016501 Continued fraction for <code>log(73)</code>.
 * @author Sean A. Irvine
 */
public class A016501 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A016501() {
    super(new A016696());
  }
}
