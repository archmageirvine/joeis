package irvine.oeis.a013;

import irvine.oeis.ContinuedFractionSequence;

/**
 * A013680 Continued fraction for <code>zeta(4)</code>.
 * @author Sean A. Irvine
 */
public class A013680 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A013680() {
    super(new A013662());
  }
}
