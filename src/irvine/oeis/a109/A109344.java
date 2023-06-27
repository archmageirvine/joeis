package irvine.oeis.a109;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A109344 a(n) consists of n 4's, n-1 8's and a single 9 (in that order).
 * @author Sean A. Irvine
 */
public class A109344 extends LinearRecurrence {

  /** Construct the sequence. */
  public A109344() {
    super(1, new long[] {1000, -1110, 111}, new long[] {49, 4489, 444889});
  }
}
