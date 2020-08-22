package irvine.oeis.a050;

import irvine.oeis.LinearRecurrence;

/**
 * A050187 a(n) = n * floor((n-1)/2).
 * @author Sean A. Irvine
 */
public class A050187 extends LinearRecurrence {

  /** Construct the sequence. */
  public A050187() {
    super(new long[] {1, -1, -2, 2, 1}, new long[] {0, 0, 0, 3, 4});
  }
}
