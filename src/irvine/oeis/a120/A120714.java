package irvine.oeis.a120;

import irvine.oeis.LinearRecurrence;

/**
 * A120714.
 * @author Sean A. Irvine
 */
public class A120714 extends LinearRecurrence {

  /** Construct the sequence. */
  public A120714() {
    super(new long[] {6, -2, -24, -3, 26, 15, 0}, new long[] {0, 14, 42, 232, 974, 4522, 20180});
  }
}
