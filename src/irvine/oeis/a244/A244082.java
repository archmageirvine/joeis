package irvine.oeis.a244;

import irvine.oeis.LinearRecurrence;

/**
 * A244082 a(n) = 32*n^2.
 * @author Sean A. Irvine
 */
public class A244082 extends LinearRecurrence {

  /** Construct the sequence. */
  public A244082() {
    super(new long[] {1, -3, 3}, new long[] {0, 32, 128});
  }
}
