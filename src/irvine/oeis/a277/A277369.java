package irvine.oeis.a277;

import irvine.oeis.LinearRecurrence;

/**
 * A277369 <code>a(0) = 5, a(1) = 8;</code> for <code>n&gt;1, a(n) = 2*a(n-1) + a(n-2)</code>.
 * @author Sean A. Irvine
 */
public class A277369 extends LinearRecurrence {

  /** Construct the sequence. */
  public A277369() {
    super(new long[] {1, 2}, new long[] {5, 8});
  }
}
