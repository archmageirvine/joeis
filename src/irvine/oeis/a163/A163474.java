package irvine.oeis.a163;

import irvine.oeis.LinearRecurrence;

/**
 * A163474 <code>a(n) = 16*a(n-1) - 61*a(n-2)</code> for <code>n &gt; 1; a(0) = 3, a(1) = 27</code>.
 * @author Sean A. Irvine
 */
public class A163474 extends LinearRecurrence {

  /** Construct the sequence. */
  public A163474() {
    super(new long[] {-61, 16}, new long[] {3, 27});
  }
}
