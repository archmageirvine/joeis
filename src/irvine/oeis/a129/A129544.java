package irvine.oeis.a129;

import irvine.oeis.LinearRecurrence;

/**
 * A129544.
 * @author Sean A. Irvine
 */
public class A129544 extends LinearRecurrence {

  /** Construct the sequence. */
  public A129544() {
    super(new long[] {1, -1, 0, -6, 6, 0, 1}, new long[] {0, 115, 136, 411, 1036, 1155, 2740});
  }
}
