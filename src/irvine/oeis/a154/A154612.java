package irvine.oeis.a154;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A154612 a(n) = 17*n + 7.
 * @author Sean A. Irvine
 */
public class A154612 extends LinearRecurrence {

  /** Construct the sequence. */
  public A154612() {
    super(new long[] {-1, 2}, new long[] {7, 24});
  }
}
