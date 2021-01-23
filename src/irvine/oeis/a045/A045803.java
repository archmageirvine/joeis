package irvine.oeis.a045;

import irvine.oeis.LinearRecurrence;

/**
 * A045803 3-ish numbers (end in 17, 19, 31, 33).
 * @author Sean A. Irvine
 */
public class A045803 extends LinearRecurrence {

  /** Construct the sequence. */
  public A045803() {
    super(new long[] {-1, 1, 0, 0, 1}, new long[] {17, 19, 31, 33, 117});
  }
}
