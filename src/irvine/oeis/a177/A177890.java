package irvine.oeis.a177;

import irvine.oeis.LinearRecurrence;

/**
 * A177890.
 * @author Sean A. Irvine
 */
public class A177890 extends LinearRecurrence {

  /** Construct the sequence. */
  public A177890() {
    super(new long[] {-1, 4, -6, 4}, new long[] {0, 1, 16, 58});
  }
}
