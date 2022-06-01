package irvine.oeis.a074;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A074514 1^n + 4^n + 8^n.
 * @author Sean A. Irvine
 */
public class A074514 extends LinearRecurrence {

  /** Construct the sequence. */
  public A074514() {
    super(new long[] {32, -44, 13}, new long[] {3, 13, 81});
  }
}
