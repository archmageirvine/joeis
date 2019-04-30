package irvine.oeis.a016;

import irvine.oeis.ContinuedFractionSequence;

/**
 * A016525 Continued fraction for <code>log(97)</code>.
 * @author Sean A. Irvine
 */
public class A016525 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A016525() {
    super(new A016720());
  }
}
