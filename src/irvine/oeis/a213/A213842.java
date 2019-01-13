package irvine.oeis.a213;

import irvine.oeis.LinearRecurrence;

/**
 * A213842.
 * @author Sean A. Irvine
 */
public class A213842 extends LinearRecurrence {

  /** Construct the sequence. */
  public A213842() {
    super(new long[] {-1, 4, -6, 4}, new long[] {1, 24, 101, 264});
  }
}
