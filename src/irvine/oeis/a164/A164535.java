package irvine.oeis.a164;

import irvine.oeis.LinearRecurrence;

/**
 * A164535 <code>a(n) = 8*a(n-1) - 14*a(n-2)</code> for <code>n &gt; 1</code>; <code>a(0) = 3, a(1) = 20</code>.
 * @author Sean A. Irvine
 */
public class A164535 extends LinearRecurrence {

  /** Construct the sequence. */
  public A164535() {
    super(new long[] {-14, 8}, new long[] {3, 20});
  }
}
