package irvine.oeis.a165;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A165151 a(n) = (3*11^n-7^n)/2.
 * @author Sean A. Irvine
 */
public class A165151 extends LinearRecurrence {

  /** Construct the sequence. */
  public A165151() {
    super(new long[] {-77, 18}, new long[] {1, 13});
  }
}
