package irvine.oeis.a063;

import irvine.oeis.LinearRecurrence;

/**
 * A063782 <code>a(0) = 1, a(1) = 3;</code> for <code>n &gt; 1, a(n) = 2*a(n-1) + 4*a(n-2)</code>.
 * @author Sean A. Irvine
 */
public class A063782 extends LinearRecurrence {

  /** Construct the sequence. */
  public A063782() {
    super(new long[] {4, 2}, new long[] {1, 3});
  }
}
