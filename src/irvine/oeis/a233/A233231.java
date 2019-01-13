package irvine.oeis.a233;

import irvine.oeis.LinearRecurrence;

/**
 * A233231.
 * @author Sean A. Irvine
 */
public class A233231 extends LinearRecurrence {

  /** Construct the sequence. */
  public A233231() {
    super(new long[] {1, -1, 0, -10, 10, 0, 1}, new long[] {2, 3, 5, 12, 29, 51, 122});
  }
}
