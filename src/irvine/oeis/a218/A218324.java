package irvine.oeis.a218;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A218324 Odd heptagonal pyramidal numbers.
 * @author Sean A. Irvine
 */
public class A218324 extends LinearRecurrence {

  /** Construct the sequence. */
  public A218324() {
    super(new long[] {-1, 4, -6, 4}, new long[] {1, 115, 645, 1911});
  }
}
