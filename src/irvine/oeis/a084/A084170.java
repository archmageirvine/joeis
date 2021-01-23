package irvine.oeis.a084;

import irvine.oeis.LinearRecurrence;

/**
 * A084170 a(n) = 5*2^n/3 + (-1)^n/3 - 1.
 * @author Sean A. Irvine
 */
public class A084170 extends LinearRecurrence {

  /** Construct the sequence. */
  public A084170() {
    super(new long[] {-2, 1, 2}, new long[] {1, 2, 6});
  }
}
