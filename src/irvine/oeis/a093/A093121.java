package irvine.oeis.a093;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A093121 A Jacobsthal Fibonacci product.
 * @author Sean A. Irvine
 */
public class A093121 extends LinearRecurrence {

  /** Construct the sequence. */
  public A093121() {
    super(new long[] {-4, 2, 7, 1}, new long[] {1, 0, 4, 6});
  }
}
