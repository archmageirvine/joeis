package irvine.oeis.a163;

import irvine.oeis.LinearRecurrence;

/**
 * A163473 <code>a(n) = 14*a(n-1) - 46*a(n-2)</code> for <code>n &gt; 1</code>; <code>a(0) = 3, a(1) = 24</code>.
 * @author Sean A. Irvine
 */
public class A163473 extends LinearRecurrence {

  /** Construct the sequence. */
  public A163473() {
    super(new long[] {-46, 14}, new long[] {3, 24});
  }
}
