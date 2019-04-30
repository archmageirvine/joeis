package irvine.oeis.a016;

import irvine.oeis.ContinuedFractionSequence;

/**
 * A016521 Continued fraction for <code>log(93)</code>.
 * @author Sean A. Irvine
 */
public class A016521 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A016521() {
    super(new A016716());
  }
}
