package irvine.oeis.a217;

import irvine.oeis.LinearRecurrence;

/**
 * A217052 <code>a(n) = 3*a(n-1) + 24*a(n-2) + a(n-3)</code>, with <code>a(0)=a(1)=1</code>, and <code>a(2)=19</code>.
 * @author Sean A. Irvine
 */
public class A217052 extends LinearRecurrence {

  /** Construct the sequence. */
  public A217052() {
    super(new long[] {1, 24, 3}, new long[] {1, 1, 19});
  }
}
