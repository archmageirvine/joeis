package irvine.oeis.a248;

import irvine.oeis.LinearRecurrence;

/**
 * A248720 a(n) = (n*(n+1))^5.
 * @author Sean A. Irvine
 */
public class A248720 extends LinearRecurrence {

  /** Construct the sequence. */
  public A248720() {
    super(new long[] {1, -11, 55, -165, 330, -462, 462, -330, 165, -55, 11}, new long[] {0, 32, 7776, 248832, 3200000, 24300000, 130691232, 550731776, 1934917632, 5904900000L, 16105100000L});
  }
}
