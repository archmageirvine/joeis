package irvine.oeis.a156;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A156845 a(n) = 12167*n - 8579.
 * @author Sean A. Irvine
 */
public class A156845 extends LinearRecurrence {

  /** Construct the sequence. */
  public A156845() {
    super(1, new long[] {-1, 2}, new long[] {3588, 15755});
  }
}
