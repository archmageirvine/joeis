package irvine.oeis.a098;

import irvine.oeis.LinearRecurrence;

/**
 * A098590 <code>a(n) = 4^n</code> for <code>n = 0..3;</code> for <code>n &gt; 3, a(n) = 4*a(n-1) + a(n-4)</code>.
 * @author Sean A. Irvine
 */
public class A098590 extends LinearRecurrence {

  /** Construct the sequence. */
  public A098590() {
    super(new long[] {1, 0, 0, 4}, new long[] {1, 4, 16, 64});
  }
}
