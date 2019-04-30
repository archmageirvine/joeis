package irvine.oeis.a081;

import irvine.oeis.LinearRecurrence;

/**
 * A081172 Tribonacci numbers: <code>a(n) = a(n-1) + a(n-2) + a(n-3)</code>, with <code>a(0) = 1, a(1) = 1, a(2) = 0</code>.
 * @author Sean A. Irvine
 */
public class A081172 extends LinearRecurrence {

  /** Construct the sequence. */
  public A081172() {
    super(new long[] {1, 1, 1}, new long[] {1, 1, 0});
  }
}
