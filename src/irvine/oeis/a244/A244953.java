package irvine.oeis.a244;

import irvine.oeis.LinearRecurrence;

/**
 * A244953 a(n) = Sum_{i=0..n} (-i mod 4).
 * @author Sean A. Irvine
 */
public class A244953 extends LinearRecurrence {

  /** Construct the sequence. */
  public A244953() {
    super(new long[] {-1, 1, 0, 0, 1}, new long[] {0, 3, 5, 6, 6});
  }
}
