package irvine.oeis.a016;

import irvine.oeis.ContinuedFractionSequence;

/**
 * A016533 Continued fraction for <code>log(11/2)</code>.
 * @author Sean A. Irvine
 */
public class A016533 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A016533() {
    super(new A016582());
  }
}
