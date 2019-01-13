package irvine.oeis.a071;

import irvine.oeis.LinearRecurrence;

/**
 * A071355.
 * @author Sean A. Irvine
 */
public class A071355 extends LinearRecurrence {

  /** Construct the sequence. */
  public A071355() {
    super(new long[] {1, -3, 3}, new long[] {3, 12, 25});
  }
}
