package irvine.oeis.a163;

import irvine.oeis.LinearRecurrence;

/**
 * A163458 <code>a(n) = 12*a(n-1) - 34*a(n-2)</code> for <code>n &gt; 1</code>; <code>a(0) = 1, a(1) = 7</code>.
 * @author Sean A. Irvine
 */
public class A163458 extends LinearRecurrence {

  /** Construct the sequence. */
  public A163458() {
    super(new long[] {-34, 12}, new long[] {1, 7});
  }
}
