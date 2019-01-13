package irvine.oeis.a020;

import irvine.oeis.LinearRecurrence;

/**
 * A020568.
 * @author Sean A. Irvine
 */
public class A020568 extends LinearRecurrence {

  /** Construct the sequence. */
  public A020568() {
    super(new long[] {600, -230, 27}, new long[] {1, 27, 499});
  }
}
