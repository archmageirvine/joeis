package irvine.oeis.a016;

import irvine.oeis.ContinuedFractionSequence;

/**
 * A016452 Continued fraction for <code>log(24)</code>.
 * @author Sean A. Irvine
 */
public class A016452 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A016452() {
    super(new A016647());
  }
}
