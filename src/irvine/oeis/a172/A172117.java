package irvine.oeis.a172;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A172117 a(n) = n*(n+1)*(20*n-17)/6.
 * @author Sean A. Irvine
 */
public class A172117 extends LinearRecurrence {

  /** Construct the sequence. */
  public A172117() {
    super(new long[] {-1, 4, -6, 4}, new long[] {0, 1, 23, 86});
  }
}
