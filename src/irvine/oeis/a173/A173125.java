package irvine.oeis.a173;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A173125 Sum_{k=floor[n/2] mod 5} C(n,k).
 * @author Sean A. Irvine
 */
public class A173125 extends LinearRecurrence {

  /** Construct the sequence. */
  public A173125() {
    super(new long[] {2, -1, -6, 3, 2}, new long[] {1, 1, 2, 3, 6});
  }
}
