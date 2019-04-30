package irvine.oeis.a164;

import irvine.oeis.LinearRecurrence;

/**
 * A164303 <code>a(n) = 2*a(n-1) + a(n-2)</code> for <code>n &gt; 1; a(0) = 3, a(1) = 11</code>.
 * @author Sean A. Irvine
 */
public class A164303 extends LinearRecurrence {

  /** Construct the sequence. */
  public A164303() {
    super(new long[] {1, 2}, new long[] {3, 11});
  }
}
