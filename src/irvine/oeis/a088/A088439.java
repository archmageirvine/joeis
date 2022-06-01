package irvine.oeis.a088;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A088439 a(3n) = 3n, otherwise a(n) = 1.
 * @author Sean A. Irvine
 */
public class A088439 extends LinearRecurrence {

  /** Construct the sequence. */
  public A088439() {
    super(new long[] {-1, 0, 0, 2, 0, 0}, new long[] {0, 1, 1, 3, 1, 1});
  }
}
