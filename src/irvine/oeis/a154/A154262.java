package irvine.oeis.a154;

import irvine.oeis.LinearRecurrence;

/**
 * A154262 <code>a(n) = 9*n^2 - 10*n + 3</code>.
 * @author Sean A. Irvine
 */
public class A154262 extends LinearRecurrence {

  /** Construct the sequence. */
  public A154262() {
    super(new long[] {1, -3, 3}, new long[] {3, 2, 19});
  }
}
