package irvine.oeis.a030;

import irvine.oeis.ContinuedFractionSequence;

/**
 * A030170 Let c be the point at which <code>Gamma(x), x&gt;0</code>, is minimized; sequence gives continued fraction for c.
 * @author Sean A. Irvine
 */
public class A030170 extends ContinuedFractionSequence {

  // Slow.

  /** Construct the sequence. */
  public A030170() {
    super(new A030169(), 100);
  }
}
