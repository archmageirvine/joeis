package irvine.oeis.a290;

import irvine.oeis.LinearRecurrence;

/**
 * A290898 p-INVERT of the positive integers, where p(S) <code>= 1 -</code> S - S^4.
 * @author Sean A. Irvine
 */
public class A290898 extends LinearRecurrence {

  /** Construct the sequence. */
  public A290898() {
    super(new long[] {-1, 9, -34, 71, -89, 71, -34, 9}, new long[] {1, 3, 8, 22, 65, 203, 647, 2053});
  }
}
