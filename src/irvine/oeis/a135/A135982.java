package irvine.oeis.a135;

import irvine.oeis.LinearRecurrence;

/**
 * A135982 2^(24n+7)-1.
 * @author Sean A. Irvine
 */
public class A135982 extends LinearRecurrence {

  /** Construct the sequence. */
  public A135982() {
    super(new long[] {-16777216, 16777217}, new long[] {127, 2147483647});
  }
}
