package irvine.oeis.a014;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A014112 a(n) = n*(n-1) + (n-2)*(n-3) + ... + 1*0 + 1 for n odd; otherwise, a(n) = n*(n-1) + (n-2)*(n-3) + ... + 2*1.
 * @author Sean A. Irvine
 */
public class A014112 extends LinearRecurrence {

  /** Construct the sequence. */
  public A014112() {
    super(1, new long[] {-1, 3, -2, -2, 3}, new long[] {1, 2, 7, 14, 27});
  }
}
