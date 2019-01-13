package irvine.oeis.a138;

import irvine.oeis.LinearRecurrence;

/**
 * A138976.
 * @author Sean A. Irvine
 */
public class A138976 extends LinearRecurrence {

  /** Construct the sequence. */
  public A138976() {
    super(new long[] {1, -1, -10, 10, 1}, new long[] {0, -3, -18, -45, -192});
  }
}
