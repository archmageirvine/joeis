package irvine.oeis.a120;

import irvine.oeis.LinearRecurrence;

/**
 * A120962 Final digit (in decimal system) of n^(n^n), i.e., n^(n^n) mod 10.
 * @author Sean A. Irvine
 */
public class A120962 extends LinearRecurrence {

  /** Construct the sequence. */
  public A120962() {
    super(new long[] {1, 0, -1, 0, 1, 0, -1, 0, 1, 0, -1, 0, 1, 0, -1, 0, 1, 0}, new long[] {0, 1, 6, 7, 6, 5, 6, 3, 6, 9, 0, 1, 6, 3, 6, 5, 6, 7});
  }
}
