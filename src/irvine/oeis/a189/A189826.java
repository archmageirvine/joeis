package irvine.oeis.a189;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A189826 a(n) = (3^n-n)*(n-1) - 2^n*(n-2).
 * @author Sean A. Irvine
 */
public class A189826 extends LinearRecurrence {

  /** Construct the sequence. */
  public A189826() {
    super(1, new long[] {36, -168, 325, -337, 202, -70, 13}, new long[] {2, 7, 40, 199, 856, 3359, 12440});
  }
}
