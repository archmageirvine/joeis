package irvine.oeis.a218;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A218155 Numbers congruent to 2, 3, 6, 11 mod 12.
 * @author Sean A. Irvine
 */
public class A218155 extends LinearRecurrence {

  /** Construct the sequence. */
  public A218155() {
    super(1, new long[] {-1, 2, -2, 2}, new long[] {2, 3, 6, 11});
  }
}
