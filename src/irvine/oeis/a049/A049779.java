package irvine.oeis.a049;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A049779 a(n) = Sum_{k=1..floor(n/2)} T(n, 2k), array T as in A049777.
 * @author Sean A. Irvine
 */
public class A049779 extends LinearRecurrence {

  /** Construct the sequence. */
  public A049779() {
    super(2, new long[] {-1, 2, 1, -4, 1, 2}, new long[] {2, 5, 13, 23, 41, 62});
  }
}
