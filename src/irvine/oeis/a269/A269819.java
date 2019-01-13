package irvine.oeis.a269;

import irvine.oeis.LinearRecurrence;

/**
 * A269819.
 * @author Sean A. Irvine
 */
public class A269819 extends LinearRecurrence {

  /** Construct the sequence. */
  public A269819() {
    super(new long[] {-1, 2, -2, 2}, new long[] {5, 11, 13, 19});
  }
}
