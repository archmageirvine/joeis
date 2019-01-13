package irvine.oeis.a158;

import irvine.oeis.LinearRecurrence;

/**
 * A158068.
 * @author Sean A. Irvine
 */
public class A158068 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158068() {
    super(new long[] {1, -1, 1, -1, 1}, new long[] {1, 2, 2, 1, 5});
  }
}
