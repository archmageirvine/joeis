package irvine.oeis.a016;

import irvine.oeis.ContinuedFractionSequence;

/**
 * A016474 Continued fraction for <code>log(46)</code>.
 * @author Sean A. Irvine
 */
public class A016474 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A016474() {
    super(new A016669());
  }
}
