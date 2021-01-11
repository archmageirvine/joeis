package irvine.oeis.a083;

import irvine.oeis.LinearRecurrence;

/**
 * A083327 a(n) = (5^n - 4^n + 3^n - 2^n)/2.
 * @author Sean A. Irvine
 */
public class A083327 extends LinearRecurrence {

  /** Construct the sequence. */
  public A083327() {
    super(new long[] {-120, 154, -71, 14}, new long[] {0, 1, 7, 40});
  }
}
