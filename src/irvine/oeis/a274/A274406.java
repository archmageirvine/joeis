package irvine.oeis.a274;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A274406 Numbers m such that 9 divides m*(m + 1).
 * @author Sean A. Irvine
 */
public class A274406 extends LinearRecurrence {

  /** Construct the sequence. */
  public A274406() {
    super(new long[] {-1, 1, 1}, new long[] {0, 8, 9});
  }
}
