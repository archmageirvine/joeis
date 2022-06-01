package irvine.oeis.a187;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A187093 a(0)=0, a(1)=a(2)=1; thereafter, a(n+1) = n^2 - a(n-1).
 * @author Sean A. Irvine
 */
public class A187093 extends LinearRecurrence {

  /** Construct the sequence. */
  public A187093() {
    super(new long[] {1, -3, 4, -4, 3}, new long[] {0, 1, 1, 3, 8});
  }
}
