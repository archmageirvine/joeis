package irvine.oeis.a084;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A084849 a(n) = 1 + n + 2*n^2.
 * @author Sean A. Irvine
 */
public class A084849 extends LinearRecurrence {

  /** Construct the sequence. */
  public A084849() {
    super(new long[] {1, -3, 3}, new long[] {1, 4, 11});
  }
}
