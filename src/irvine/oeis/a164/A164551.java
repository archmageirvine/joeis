package irvine.oeis.a164;

import irvine.oeis.LinearRecurrence;

/**
 * A164551 <code>a(n) = 10*a(n-1)-19*a(n-2)</code> for <code>n &gt; 1</code>; <code>a(0) = 1, a(1) = 9</code>.
 * @author Sean A. Irvine
 */
public class A164551 extends LinearRecurrence {

  /** Construct the sequence. */
  public A164551() {
    super(new long[] {-19, 10}, new long[] {1, 9});
  }
}
