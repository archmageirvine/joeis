package irvine.oeis.a187;

import irvine.oeis.LinearRecurrence;

/**
 * A187756 <code>a(n) = n^2 * (4*n^2 - 1) / 3</code>.
 * @author Sean A. Irvine
 */
public class A187756 extends LinearRecurrence {

  /** Construct the sequence. */
  public A187756() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {0, 1, 20, 105, 336});
  }
}
