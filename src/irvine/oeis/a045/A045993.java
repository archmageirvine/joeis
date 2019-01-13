package irvine.oeis.a045;

import irvine.oeis.LinearRecurrence;

/**
 * A045993.
 * @author Sean A. Irvine
 */
public class A045993 extends LinearRecurrence {

  /** Construct the sequence. */
  public A045993() {
    super(new long[] {8, -18, 10}, new long[] {1, 9, 72});
  }
}
