package irvine.oeis.a030;

import irvine.oeis.ContinuedFractionSequence;

/**
 * A030172 Let c be the point at which <code>Gamma(x), x&gt;0</code>, is minimized; sequence gives continued fraction for <code>Gamma(c)</code>.
 * @author Sean A. Irvine
 */
public class A030172 extends ContinuedFractionSequence {

  // Very slow.

  /** Construct the sequence. */
  public A030172() {
    super(new A030171(), 100);
  }
}
