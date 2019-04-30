package irvine.oeis.a016;

import irvine.oeis.ContinuedFractionSequence;

/**
 * A016507 Continued fraction for <code>log(79)</code>.
 * @author Sean A. Irvine
 */
public class A016507 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A016507() {
    super(new A016702());
  }
}
