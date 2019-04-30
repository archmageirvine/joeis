package irvine.oeis.a016;

import irvine.oeis.ContinuedFractionSequence;

/**
 * A016740 Continued fraction for <code>log(12)</code>.
 * @author Sean A. Irvine
 */
public class A016740 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A016740() {
    super(new A016635());
  }
}
