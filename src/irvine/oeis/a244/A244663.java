package irvine.oeis.a244;

import irvine.oeis.LinearRecurrence;

/**
 * A244663.
 * @author Sean A. Irvine
 */
public class A244663 extends LinearRecurrence {

  /** Construct the sequence. */
  public A244663() {
    super(new long[] {1000, -1110, 111}, new long[] {111, 10111, 1001111});
  }
}
