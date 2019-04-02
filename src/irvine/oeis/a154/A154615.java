package irvine.oeis.a154;

import irvine.oeis.LinearRecurrence;

/**
 * A154615 a(n) = A022998(n)^2.
 * @author Sean A. Irvine
 */
public class A154615 extends LinearRecurrence {

  /** Construct the sequence. */
  public A154615() {
    super(new long[] {1, 0, -3, 0, 3, 0}, new long[] {0, 1, 16, 9, 64, 25});
  }
}
