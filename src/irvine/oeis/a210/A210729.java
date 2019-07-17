package irvine.oeis.a210;

import irvine.oeis.LinearRecurrence;

/**
 * A210729 <code>a(n) = a(n-1) + a(n-2) + n + 3</code> with <code>n&gt;1, a(0)=1, a(1)=2</code>.
 * @author Sean A. Irvine
 */
public class A210729 extends LinearRecurrence {

  /** Construct the sequence. */
  public A210729() {
    super(new long[] {1, -1, -2, 3}, new long[] {1, 2, 8, 16});
  }
}
