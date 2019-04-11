package irvine.oeis.a098;

import irvine.oeis.LinearRecurrence;

/**
 * A098588 <code>a(n) = 2^n</code> for <code>n = 0</code>..4; for <code>n &gt; 4, a(n) = 2*a(n-1) + a(n-5)</code>.
 * @author Sean A. Irvine
 */
public class A098588 extends LinearRecurrence {

  /** Construct the sequence. */
  public A098588() {
    super(new long[] {1, 0, 0, 0, 2}, new long[] {1, 2, 4, 8, 16});
  }
}
