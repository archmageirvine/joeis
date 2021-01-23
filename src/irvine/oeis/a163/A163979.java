package irvine.oeis.a163;

import irvine.oeis.LinearRecurrence;

/**
 * A163979 a(n) = n*(n-1) + A144437(n+2).
 * @author Sean A. Irvine
 */
public class A163979 extends LinearRecurrence {

  /** Construct the sequence. */
  public A163979() {
    super(new long[] {1, -2, 1, -1, 2}, new long[] {1, 3, 5, 7, 15});
  }
}
