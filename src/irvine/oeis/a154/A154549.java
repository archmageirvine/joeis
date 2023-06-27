package irvine.oeis.a154;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A154549 a(n) = 111111*n.
 * @author Sean A. Irvine
 */
public class A154549 extends LinearRecurrence {

  /** Construct the sequence. */
  public A154549() {
    super(1, new long[] {-1, 2}, new long[] {111111, 222222});
  }
}
