package irvine.oeis.a201;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A201279 a(n) = 6n^2 + 10n + 5.
 * @author Sean A. Irvine
 */
public class A201279 extends LinearRecurrence {

  /** Construct the sequence. */
  public A201279() {
    super(new long[] {1, -3, 3}, new long[] {5, 21, 49});
  }
}
