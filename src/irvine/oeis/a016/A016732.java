package irvine.oeis.a016;

import irvine.oeis.ContinuedFractionSequence;

/**
 * A016732 Continued fraction for <code>log(4)</code>.
 * @author Sean A. Irvine
 */
public class A016732 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A016732() {
    super(new A016627());
  }
}
