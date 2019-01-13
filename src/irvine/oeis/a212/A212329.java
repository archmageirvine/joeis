package irvine.oeis.a212;

import irvine.oeis.LinearRecurrence;

/**
 * A212329.
 * @author Sean A. Irvine
 */
public class A212329 extends LinearRecurrence {

  /** Construct the sequence. */
  public A212329() {
    super(new long[] {1, -7, 7}, new long[] {0, 5, 36});
  }
}
