package irvine.oeis.a278;

import irvine.oeis.LinearRecurrence;

/**
 * A278128 a(n) = 288*2^n - 156.
 * @author Sean A. Irvine
 */
public class A278128 extends LinearRecurrence {

  /** Construct the sequence. */
  public A278128() {
    super(new long[] {-2, 3}, new long[] {132, 420});
  }
}
