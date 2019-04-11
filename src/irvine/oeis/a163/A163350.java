package irvine.oeis.a163;

import irvine.oeis.LinearRecurrence;

/**
 * A163350 <code>a(n) = 8*a(n-1) - 14*a(n-2)</code> for <code>n &gt; 1</code>; <code>a(0) = 1, a(1) = 6</code>.
 * @author Sean A. Irvine
 */
public class A163350 extends LinearRecurrence {

  /** Construct the sequence. */
  public A163350() {
    super(new long[] {-14, 8}, new long[] {1, 6});
  }
}
