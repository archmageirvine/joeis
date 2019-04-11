package irvine.oeis.a163;

import irvine.oeis.LinearRecurrence;

/**
 * A163864 <code>a(n) = 2*a(n-2)</code> for <code>n &gt; 2</code>; <code>a(1) = 1, a(2) = 6</code>.
 * @author Sean A. Irvine
 */
public class A163864 extends LinearRecurrence {

  /** Construct the sequence. */
  public A163864() {
    super(new long[] {2, 0}, new long[] {1, 6});
  }
}
