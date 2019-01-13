package irvine.oeis.a050;

import irvine.oeis.LinearRecurrence;

/**
 * A050494.
 * @author Sean A. Irvine
 */
public class A050494 extends LinearRecurrence {

  /** Construct the sequence. */
  public A050494() {
    super(new long[] {-1, 8, -28, 56, -70, 56, -28, 8}, new long[] {1, 10, 52, 192, 570, 1452, 3300, 6864});
  }
}
