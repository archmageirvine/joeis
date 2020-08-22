package irvine.oeis.a261;

import irvine.oeis.LinearRecurrence;

/**
 * A261140 a(n) = 3486107472997423 + (n-1)*371891575525470.
 * @author Sean A. Irvine
 */
public class A261140 extends LinearRecurrence {

  /** Construct the sequence. */
  public A261140() {
    super(new long[] {-1, 2}, new long[] {3486107472997423L, 3857999048522893L});
  }
}
