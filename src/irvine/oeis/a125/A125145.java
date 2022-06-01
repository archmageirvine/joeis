package irvine.oeis.a125;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A125145 a(n) = 3a(n-1) + 3a(n-2). a(0) = 1, a(1) = 4.
 * @author Sean A. Irvine
 */
public class A125145 extends LinearRecurrence {

  /** Construct the sequence. */
  public A125145() {
    super(new long[] {3, 3}, new long[] {1, 4});
  }
}
