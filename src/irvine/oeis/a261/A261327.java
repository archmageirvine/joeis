package irvine.oeis.a261;

import irvine.oeis.LinearRecurrence;

/**
 * A261327 a(n) = (n^2 + 4) / 4^((n + 1) mod 2).
 * @author Sean A. Irvine
 */
public class A261327 extends LinearRecurrence {

  /** Construct the sequence. */
  public A261327() {
    super(new long[] {1, 0, -3, 0, 3, 0}, new long[] {1, 5, 2, 13, 5, 29});
  }
}
