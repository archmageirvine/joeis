package irvine.oeis.a163;

import irvine.oeis.LinearRecurrence;

/**
 * A163307 <code>a(n) = 14*a(n-1) - 44*a(n-2)</code> for <code>n &gt; 1; a(0) = 1, a(1) = 8</code>.
 * @author Sean A. Irvine
 */
public class A163307 extends LinearRecurrence {

  /** Construct the sequence. */
  public A163307() {
    super(new long[] {-44, 14}, new long[] {1, 8});
  }
}
