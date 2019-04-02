package irvine.oeis.a218;

import irvine.oeis.LinearRecurrence;

/**
 * A218325 Even heptagonal pyramidal numbers.
 * @author Sean A. Irvine
 */
public class A218325 extends LinearRecurrence {

  /** Construct the sequence. */
  public A218325() {
    super(new long[] {-1, 1, 0, 3, -3, 0, -3, 3, 0, 1}, new long[] {8, 26, 60, 196, 308, 456, 880, 1166, 1508, 2380});
  }
}
