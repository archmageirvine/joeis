package irvine.oeis.a156;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A156853 a(n) = 2025*n^2 - 649*n + 52.
 * @author Sean A. Irvine
 */
public class A156853 extends LinearRecurrence {

  /** Construct the sequence. */
  public A156853() {
    super(new long[] {1, -3, 3}, new long[] {1428, 6854, 16330});
  }
}
