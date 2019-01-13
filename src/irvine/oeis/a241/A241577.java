package irvine.oeis.a241;

import irvine.oeis.LinearRecurrence;

/**
 * A241577.
 * @author Sean A. Irvine
 */
public class A241577 extends LinearRecurrence {

  /** Construct the sequence. */
  public A241577() {
    super(new long[] {-1, 4, -6, 4}, new long[] {1, 1, 15, 49});
  }
}
