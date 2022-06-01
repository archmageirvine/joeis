package irvine.oeis.a127;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A127736 a(n) = n*(n^2 + 2*n - 1)/2.
 * @author Sean A. Irvine
 */
public class A127736 extends LinearRecurrence {

  /** Construct the sequence. */
  public A127736() {
    super(new long[] {-1, 4, -6, 4}, new long[] {1, 7, 21, 46});
  }
}
