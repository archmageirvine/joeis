package irvine.oeis.a164;

import irvine.oeis.LinearRecurrence;

/**
 * A164599 <code>a(n) = 14*a(n - 1) - 47*a(n - 2)</code> for <code>n &gt; 1; a(0) = 1, a(1) = 15</code>.
 * @author Sean A. Irvine
 */
public class A164599 extends LinearRecurrence {

  /** Construct the sequence. */
  public A164599() {
    super(new long[] {-47, 14}, new long[] {1, 15});
  }
}
