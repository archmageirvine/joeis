package irvine.oeis.a163;

import irvine.oeis.LinearRecurrence;

/**
 * A163306 <code>a(n) = 12*a(n-1) - 31*a(n-2)</code> for <code>n &gt; 1; a(0) = 1, a(1) = 7</code>.
 * @author Sean A. Irvine
 */
public class A163306 extends LinearRecurrence {

  /** Construct the sequence. */
  public A163306() {
    super(new long[] {-31, 12}, new long[] {1, 7});
  }
}
