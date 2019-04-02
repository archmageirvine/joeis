package irvine.oeis.a093;

import irvine.oeis.LinearRecurrence;

/**
 * A093044 A Jacobsthal Fibonacci product.
 * @author Sean A. Irvine
 */
public class A093044 extends LinearRecurrence {

  /** Construct the sequence. */
  public A093044() {
    super(new long[] {-4, 2, 7, 1}, new long[] {1, 0, 2, 2});
  }
}
