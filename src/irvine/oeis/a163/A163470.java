package irvine.oeis.a163;

import irvine.oeis.LinearRecurrence;

/**
 * A163470 <code>a(n) = 8*a(n-1) - 13*a(n-2)</code> for <code>n &gt; 1</code>; <code>a(0) = 3, a(1) = 15</code>.
 * @author Sean A. Irvine
 */
public class A163470 extends LinearRecurrence {

  /** Construct the sequence. */
  public A163470() {
    super(new long[] {-13, 8}, new long[] {3, 15});
  }
}
