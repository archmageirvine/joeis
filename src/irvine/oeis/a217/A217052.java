package irvine.oeis.a217;

import irvine.oeis.LinearRecurrence;

/**
 * A217052 a(n) = 3*a(n-1) + 24*a(n-2) + a(n-3), with a(0)=a(1)=1, and a(2)=19.
 * @author Sean A. Irvine
 */
public class A217052 extends LinearRecurrence {

  /** Construct the sequence. */
  public A217052() {
    super(new long[] {1, 24, 3}, new long[] {1, 1, 19});
  }
}
