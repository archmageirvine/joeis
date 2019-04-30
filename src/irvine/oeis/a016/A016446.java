package irvine.oeis.a016;

import irvine.oeis.ContinuedFractionSequence;

/**
 * A016446 Continued fraction for <code>log(18)</code>.
 * @author Sean A. Irvine
 */
public class A016446 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A016446() {
    super(new A016641());
  }
}
