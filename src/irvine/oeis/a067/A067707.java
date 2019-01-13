package irvine.oeis.a067;

import irvine.oeis.LinearRecurrence;

/**
 * A067707.
 * @author Sean A. Irvine
 */
public class A067707 extends LinearRecurrence {

  /** Construct the sequence. */
  public A067707() {
    super(new long[] {1, -3, 3}, new long[] {15, 36, 63});
  }
}
