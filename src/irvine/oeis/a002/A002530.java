package irvine.oeis.a002;

import irvine.oeis.LinearRecurrence;

/**
 * A002530 <code>a(n) = 4*a(n-2) - a(n-4)</code> for <code>n &gt; 1, a(n) = n</code> for <code>n = 0, 1</code>.
 * @author Sean A. Irvine
 */
public class A002530 extends LinearRecurrence {

  /** Construct the sequence. */
  public A002530() {
    super(new long[] {-1, 0, 4, 0}, new long[] {0, 1, 1, 3});
  }
}
