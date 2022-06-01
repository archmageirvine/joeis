package irvine.oeis.a154;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A154518 a(n) = 216*n - 12.
 * @author Sean A. Irvine
 */
public class A154518 extends LinearRecurrence {

  /** Construct the sequence. */
  public A154518() {
    super(new long[] {-1, 2}, new long[] {204, 420});
  }
}
