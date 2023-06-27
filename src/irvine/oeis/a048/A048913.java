package irvine.oeis.a048;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A048913 Indices of 9-gonal numbers which are also pentagonal.
 * @author Sean A. Irvine
 */
public class A048913 extends LinearRecurrence {

  /** Construct the sequence. */
  public A048913() {
    super(1, new long[] {1, -1, -12098, 12098, 1}, new long[] {1, 14, 7189, 165026, 86968201});
  }
}
