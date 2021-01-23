package irvine.oeis.a030;

import irvine.oeis.ContinuedFractionSequence;

/**
 * A030172 Let c be the point at which Gamma(x), x&gt;0, is minimized; sequence gives continued fraction for Gamma(c).
 * @author Sean A. Irvine
 */
public class A030172 extends ContinuedFractionSequence {

  // Very slow.

  /** Construct the sequence. */
  public A030172() {
    super(new A030171(), 100);
  }
}
