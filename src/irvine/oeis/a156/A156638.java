package irvine.oeis.a156;

import irvine.oeis.LinearRecurrence;

/**
 * A156638 Numbers k such that k^2 + 2 == 0 (mod 9).
 * @author Sean A. Irvine
 */
public class A156638 extends LinearRecurrence {

  /** Construct the sequence. */
  public A156638() {
    super(new long[] {-1, 1, 1}, new long[] {4, 5, 13});
  }
}
