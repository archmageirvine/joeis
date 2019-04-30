package irvine.oeis.a016;

import irvine.oeis.ContinuedFractionSequence;

/**
 * A016550 Continued fraction for <code>log(45/2)</code>.
 * @author Sean A. Irvine
 */
public class A016550 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A016550() {
    super(new A016599());
  }
}
