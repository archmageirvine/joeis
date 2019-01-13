package irvine.oeis.a129;

import irvine.oeis.LinearRecurrence;

/**
 * A129288.
 * @author Sean A. Irvine
 */
public class A129288 extends LinearRecurrence {

  /** Construct the sequence. */
  public A129288() {
    super(new long[] {1, -1, 0, -6, 6, 0, 1}, new long[] {0, 36, 39, 123, 319, 336, 820});
  }
}
