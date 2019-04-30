package irvine.oeis.a016;

import irvine.oeis.ContinuedFractionSequence;

/**
 * A016523 Continued fraction for <code>log(95)</code>.
 * @author Sean A. Irvine
 */
public class A016523 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A016523() {
    super(new A016718());
  }
}
