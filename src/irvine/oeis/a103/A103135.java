package irvine.oeis.a103;

import irvine.oeis.LinearRecurrence;

/**
 * A103135 G.f. <code>(-3x^3-18x^2+14x-1)/(3x^4-5x^2+4x-1)</code>.
 * @author Sean A. Irvine
 */
public class A103135 extends LinearRecurrence {

  /** Construct the sequence. */
  public A103135() {
    super(new long[] {3, 0, -5, 4}, new long[] {1, -10, -27, -55});
  }
}
