package irvine.oeis.a290;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A290071 a(n) = (1/48)*n*(n+5)^2*(1*n^3 + 7*n^2 + 16*n + 28).
 * @author Sean A. Irvine
 */
public class A290071 extends LinearRecurrence {

  /** Construct the sequence. */
  public A290071() {
    super(new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {0, 39, 196, 664, 1809, 4250, 8954});
  }
}
