package irvine.oeis.a084;

import irvine.oeis.LinearRecurrence;

/**
 * A084707.
 * @author Sean A. Irvine
 */
public class A084707 extends LinearRecurrence {

  /** Construct the sequence. */
  public A084707() {
    super(new long[] {1, -3, 0, 3}, new long[] {1, 3, 9, 27});
  }
}
