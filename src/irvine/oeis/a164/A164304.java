package irvine.oeis.a164;

import irvine.oeis.LinearRecurrence;

/**
 * A164304 <code>a(n) = 4*a(n-1) - 2*a(n-2)</code> for <code>n &gt; 1</code>; <code>a(0) = 3, a(1) = 14</code>.
 * @author Sean A. Irvine
 */
public class A164304 extends LinearRecurrence {

  /** Construct the sequence. */
  public A164304() {
    super(new long[] {-2, 4}, new long[] {3, 14});
  }
}
