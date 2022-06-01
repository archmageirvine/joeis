package irvine.oeis.a278;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A278124 a(n) = 172*2^n - 176.
 * @author Sean A. Irvine
 */
public class A278124 extends LinearRecurrence {

  /** Construct the sequence. */
  public A278124() {
    super(new long[] {-2, 3}, new long[] {-4, 168});
  }
}
