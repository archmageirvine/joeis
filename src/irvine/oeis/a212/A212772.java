package irvine.oeis.a212;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A212772 a(n) = floor((n+1)*(n-3)*(n-4)/12).
 * @author Sean A. Irvine
 */
public class A212772 extends LinearRecurrence {

  /** Construct the sequence. */
  public A212772() {
    super(new long[] {-1, 3, -3, 1, 1, -3, 3}, new long[] {1, 1, 0, 0, 0, 1, 3});
  }
}
