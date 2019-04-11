package irvine.oeis.a103;

import irvine.oeis.LinearRecurrence;

/**
 * A103644 G.f. <code>(3x+1)/(1+2x-6x^2-27x^3)</code>.
 * @author Sean A. Irvine
 */
public class A103644 extends LinearRecurrence {

  /** Construct the sequence. */
  public A103644() {
    super(new long[] {27, 6, -2}, new long[] {1, 1, 4});
  }
}
