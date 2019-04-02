package irvine.oeis.a217;

import irvine.oeis.LinearRecurrence;

/**
 * A217053 a(n) = 3*a(n-1) + 24*a(n-2) + a(n-3), with a(0) = 2, a(1) = 5, and a(2) = 62.
 * @author Sean A. Irvine
 */
public class A217053 extends LinearRecurrence {

  /** Construct the sequence. */
  public A217053() {
    super(new long[] {1, 24, 3}, new long[] {2, 5, 62});
  }
}
