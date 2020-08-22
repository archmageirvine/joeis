package irvine.oeis.a278;

import irvine.oeis.LinearRecurrence;

/**
 * A278417 a(n) = n*((2+sqrt(3))^n + (2-sqrt(3))^n)/2.
 * @author Sean A. Irvine
 */
public class A278417 extends LinearRecurrence {

  /** Construct the sequence. */
  public A278417() {
    super(new long[] {-1, 8, -18, 8}, new long[] {0, 2, 14, 78});
  }
}
