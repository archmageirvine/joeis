package irvine.oeis.a164;

import irvine.oeis.LinearRecurrence;

/**
 * A164305 <code>a(n) = 6*a(n-1) - 7*a(n-2)</code> for <code>n &gt; 1; a(0) = 3, a(1) = 17</code>.
 * @author Sean A. Irvine
 */
public class A164305 extends LinearRecurrence {

  /** Construct the sequence. */
  public A164305() {
    super(new long[] {-7, 6}, new long[] {3, 17});
  }
}
