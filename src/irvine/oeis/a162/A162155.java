package irvine.oeis.a162;

import irvine.oeis.LinearRecurrence;

/**
 * A162155.
 * @author Sean A. Irvine
 */
public class A162155 extends LinearRecurrence {

  /** Construct the sequence. */
  public A162155() {
    super(new long[] {1, -1, 1, -1, -2, 2, -2, 2, 1, -1, 1}, new long[] {2, 11, 10, 5, 2, 83, 82, 13, 2, 219, 218});
  }
}
