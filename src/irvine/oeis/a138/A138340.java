package irvine.oeis.a138;

import irvine.oeis.LinearRecurrence;

/**
 * A138340 Expansion of <code>(1-8x)/(1-4x+16x^2)</code>.
 * @author Sean A. Irvine
 */
public class A138340 extends LinearRecurrence {

  /** Construct the sequence. */
  public A138340() {
    super(new long[] {-16, 4}, new long[] {1, -4});
  }
}
