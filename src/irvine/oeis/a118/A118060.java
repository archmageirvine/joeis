package irvine.oeis.a118;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A118060 a(n) = 1681*n^2 - 984*n - 696.
 * @author Sean A. Irvine
 */
public class A118060 extends LinearRecurrence {

  /** Construct the sequence. */
  public A118060() {
    super(new long[] {1, -3, 3}, new long[] {1, 4060, 11481});
  }
}
