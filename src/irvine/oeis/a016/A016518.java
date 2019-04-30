package irvine.oeis.a016;

import irvine.oeis.ContinuedFractionSequence;

/**
 * A016518 Continued fraction for <code>log(90)</code>.
 * @author Sean A. Irvine
 */
public class A016518 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A016518() {
    super(new A016713());
  }
}
