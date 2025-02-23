package irvine.oeis.a123;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A123968 a(n) = n^2 - 3, starting at n=1.
 * @author Sean A. Irvine
 */
public class A123968 extends LinearRecurrence {

  /** Construct the sequence. */
  public A123968() {
    super(1, new long[] {1, -3, 3}, new long[] {-2, 1, 6});
  }
}
