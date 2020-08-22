package irvine.oeis.a152;

import irvine.oeis.LinearRecurrence;

/**
 * A152161 a(n) = 100*n^2 + 100*n + 21.
 * @author Sean A. Irvine
 */
public class A152161 extends LinearRecurrence {

  /** Construct the sequence. */
  public A152161() {
    super(new long[] {1, -3, 3}, new long[] {21, 221, 621});
  }
}
