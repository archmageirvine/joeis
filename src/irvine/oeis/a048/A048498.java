package irvine.oeis.a048;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A048498 a(n) = 2^(n-1)*(5*n-8) + 5.
 * @author Sean A. Irvine
 */
public class A048498 extends LinearRecurrence {

  /** Construct the sequence. */
  public A048498() {
    super(new long[] {4, -8, 5}, new long[] {1, 2, 9});
  }
}
