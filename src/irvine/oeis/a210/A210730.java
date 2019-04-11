package irvine.oeis.a210;

import irvine.oeis.LinearRecurrence;

/**
 * A210730 <code>a(n) = a(n-1) + a(n-2) + n + 2</code> with <code>n&gt;1, a(0)=a(1)=0</code>.
 * @author Sean A. Irvine
 */
public class A210730 extends LinearRecurrence {

  /** Construct the sequence. */
  public A210730() {
    super(new long[] {1, -1, -2, 3}, new long[] {0, 0, 4, 9});
  }
}
