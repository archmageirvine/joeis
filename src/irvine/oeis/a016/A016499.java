package irvine.oeis.a016;

import irvine.oeis.ContinuedFractionSequence;

/**
 * A016499 Continued fraction for <code>log(71)</code>.
 * @author Sean A. Irvine
 */
public class A016499 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A016499() {
    super(new A016694());
  }
}
