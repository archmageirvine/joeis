package irvine.oeis.a158;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A158306 324n - 1.
 * @author Sean A. Irvine
 */
public class A158306 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158306() {
    super(1, new long[] {-1, 2}, new long[] {323, 647});
  }
}
