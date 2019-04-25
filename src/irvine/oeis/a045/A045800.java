package irvine.oeis.a045;

import irvine.oeis.LinearRecurrence;

/**
 * A045800 0-ish numbers (end in 01, 07, 43, 49).
 * @author Sean A. Irvine
 */
public class A045800 extends LinearRecurrence {

  /** Construct the sequence. */
  public A045800() {
    super(new long[] {-1, 1, 0, 0, 1}, new long[] {1, 7, 43, 49, 101});
  }
}
