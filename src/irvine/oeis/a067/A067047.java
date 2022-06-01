package irvine.oeis.a067;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A067047 a(n) = lcm(n, n+1, n+2, n+3)/12.
 * @author Sean A. Irvine
 */
public class A067047 extends LinearRecurrence {

  /** Construct the sequence. */
  public A067047() {
    super(new long[] {1, 0, 0, -5, 0, 0, 10, 0, 0, -10, 0, 0, 5, 0, 0}, new long[] {1, 5, 5, 35, 70, 42, 210, 330, 165, 715, 1001, 455, 1820, 2380, 1020});
  }
}
