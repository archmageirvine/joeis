package irvine.oeis.a290;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A290721 a(n) = 4^n - n - 1.
 * @author Sean A. Irvine
 */
public class A290721 extends LinearRecurrence {

  /** Construct the sequence. */
  public A290721() {
    super(1, new long[] {4, -9, 6}, new long[] {2, 13, 60});
  }
}
