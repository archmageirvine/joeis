package irvine.oeis.a004;

import irvine.oeis.LinearRecurrence;

/**
 * A004187 a(n) = 7*a(n-1) - a(n-2) with a(0) = 0, a(1) = 1.
 * @author Sean A. Irvine
 */
public class A004187 extends LinearRecurrence {

  /** Construct the sequence. */
  public A004187() {
    super(new long[]{-1, 7}, new long[] {0, 1});
  }
}
