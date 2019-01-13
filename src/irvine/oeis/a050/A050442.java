package irvine.oeis.a050;

import irvine.oeis.LinearRecurrence;

/**
 * A050442.
 * @author Sean A. Irvine
 */
public class A050442 extends LinearRecurrence {

  /** Construct the sequence. */
  public A050442() {
    super(new long[] {-1, 1, 3, -3, -3, 3, 1}, new long[] {0, 4, 8, 32, 48, 108, 144});
  }
}
