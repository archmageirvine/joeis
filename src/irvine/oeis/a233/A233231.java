package irvine.oeis.a233;

import irvine.oeis.LinearRecurrence;

/**
 * A233231 <code>a(n) = 10*a(n-3) - a(n-6) + 4</code> for <code>n&gt;5, a(0)=2, a(1)=3, a(2)=5, a(3)=12, a(4)=29, a(5)=51</code>.
 * @author Sean A. Irvine
 */
public class A233231 extends LinearRecurrence {

  /** Construct the sequence. */
  public A233231() {
    super(new long[] {1, -1, 0, -10, 10, 0, 1}, new long[] {2, 3, 5, 12, 29, 51, 122});
  }
}
