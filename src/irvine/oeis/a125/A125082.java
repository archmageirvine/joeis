package irvine.oeis.a125;

import irvine.oeis.LinearRecurrence;

/**
 * A125082 a(n) = n^4 - n^3 - n^2 - n - 1.
 * @author Sean A. Irvine
 */
public class A125082 extends LinearRecurrence {

  /** Construct the sequence. */
  public A125082() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {-1, -3, 1, 41, 171});
  }
}
