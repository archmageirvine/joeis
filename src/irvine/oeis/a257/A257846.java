package irvine.oeis.a257;

import irvine.oeis.LinearRecurrence;

/**
 * A257846 a(n) = floor(n/6) * (n mod 6).
 * @author Sean A. Irvine
 */
public class A257846 extends LinearRecurrence {

  /** Construct the sequence. */
  public A257846() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0}, new long[] {0, 0, 0, 0, 0, 0, 0, 1, 2, 3, 4, 5});
  }
}
