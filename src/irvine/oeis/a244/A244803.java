package irvine.oeis.a244;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A244803 The 360 degree spoke (or ray) of a hexagonal spiral of Ulam.
 * @author Sean A. Irvine
 */
public class A244803 extends LinearRecurrence {

  /** Construct the sequence. */
  public A244803() {
    super(1, new long[] {1, -3, 3}, new long[] {1, 12, 47});
  }
}
