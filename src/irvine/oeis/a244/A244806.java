package irvine.oeis.a244;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A244806 The 180 degree spoke (or ray) of a hexagonal spiral of Ulam.
 * @author Sean A. Irvine
 */
public class A244806 extends LinearRecurrence {

  /** Construct the sequence. */
  public A244806() {
    super(new long[] {1, -3, 3}, new long[] {1, 18, 59});
  }
}
