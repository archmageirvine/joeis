package irvine.oeis.a027;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A027959 a(n) = Sum_{k=m..n} T(k,n-k), where m = floor((n+1)/2); a(n) is the n-th diagonal-sum of left justified array T given by A027948.
 * @author Sean A. Irvine
 */
public class A027959 extends LinearRecurrence {

  /** Construct the sequence. */
  public A027959() {
    super(new long[] {1, -1, -3, 1, 3, 0}, new long[] {1, 2, 3, 5, 7, 12}, 1);
  }
}
