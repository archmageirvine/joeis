package irvine.oeis.a105;

import irvine.oeis.LinearRecurrence;

/**
 * A105036.
 * @author Sean A. Irvine
 */
public class A105036 extends LinearRecurrence {

  /** Construct the sequence. */
  public A105036() {
    super(new long[] {1, -1, -26, 26, 1}, new long[] {0, 4, 8, 116, 220});
  }
}
