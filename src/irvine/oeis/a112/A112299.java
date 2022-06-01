package irvine.oeis.a112;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A112299 Expansion of x * (1 - x) * (1 - x^2) * (1 - x^3) / (1 - x^8) in powers of x.
 * @author Sean A. Irvine
 */
public class A112299 extends LinearRecurrence {

  /** Construct the sequence. */
  public A112299() {
    super(new long[] {-1, 0, -1, 0, -1, 0}, new long[] {1, -1, -1, 0, 1, 1});
  }
}
