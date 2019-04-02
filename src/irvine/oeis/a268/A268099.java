package irvine.oeis.a268;

import irvine.oeis.LinearRecurrence;

/**
 * A268099 a(n) = 2^(n mod 2)*5*10^floor(n/2) - 1.
 * @author Sean A. Irvine
 */
public class A268099 extends LinearRecurrence {

  /** Construct the sequence. */
  public A268099() {
    super(new long[] {-10, 10, 1}, new long[] {4, 9, 49});
  }
}
