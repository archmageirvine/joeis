package irvine.oeis.a145;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A145766 Partial sums of A020988.
 * @author Sean A. Irvine
 */
public class A145766 extends LinearRecurrence {

  /** Construct the sequence. */
  public A145766() {
    super(new long[] {4, -9, 6}, new long[] {0, 2, 12});
  }
}
