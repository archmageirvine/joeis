package irvine.oeis.a016;

import irvine.oeis.ContinuedFractionSequence;

/**
 * A016524 Continued fraction for <code>log(96)</code>.
 * @author Sean A. Irvine
 */
public class A016524 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A016524() {
    super(new A016719());
  }
}
