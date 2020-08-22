package irvine.oeis.a023;

import irvine.oeis.LinearRecurrence;

/**
 * A023857 a(n) = 1*(n+3-1) + 2*(n+3-2) + .... + k*(n+3-k), where k=floor((n+1)/2).
 * @author Sean A. Irvine
 */
public class A023857 extends LinearRecurrence {

  /** Construct the sequence. */
  public A023857() {
    super(new long[] {-1, 1, 3, -3, -3, 3, 1}, new long[] {3, 4, 13, 16, 34, 40, 70});
  }
}
