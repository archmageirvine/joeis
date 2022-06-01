package irvine.oeis.a023;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A023856 a(n) = 1*(n+1-1) + 2*(n+1-2) + ... + k*(n+1-k), where k = floor((n+1)/2).
 * @author Sean A. Irvine
 */
public class A023856 extends LinearRecurrence {

  /** Construct the sequence. */
  public A023856() {
    super(new long[] {-1, 1, 3, -3, -3, 3, 1}, new long[] {2, 3, 10, 13, 28, 34, 60});
  }
}
