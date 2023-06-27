package irvine.oeis.a023;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A023855 a(n) = 1*(n) + 2*(n-1) + 3*(n-2) + ... + (n+1-k)*k, where k = floor((n+1)/2).
 * @author Sean A. Irvine
 */
public class A023855 extends LinearRecurrence {

  /** Construct the sequence. */
  public A023855() {
    super(1, new long[] {-1, 1, 3, -3, -3, 3, 1}, new long[] {1, 2, 7, 10, 22, 28, 50});
  }
}
