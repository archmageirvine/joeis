package irvine.oeis.a163;

import irvine.oeis.LinearRecurrence;

/**
 * A163346 <code>a(n) = 10*a(n-1) - 23*a(n-2)</code> for <code>n &gt; 1; a(0) = 1, a(1) = 7</code>.
 * @author Sean A. Irvine
 */
public class A163346 extends LinearRecurrence {

  /** Construct the sequence. */
  public A163346() {
    super(new long[] {-23, 10}, new long[] {1, 7});
  }
}
