package irvine.oeis.a217;

import irvine.oeis.LinearRecurrence;

/**
 * A217053 <code>a(n) = 3*a(n-1) + 24*a(n-2) + a(n-3)</code>, with <code>a(0) = 2, a(1) = 5</code>, and <code>a(2) = 62</code>.
 * @author Sean A. Irvine
 */
public class A217053 extends LinearRecurrence {

  /** Construct the sequence. */
  public A217053() {
    super(new long[] {1, 24, 3}, new long[] {2, 5, 62});
  }
}
