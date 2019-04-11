package irvine.oeis.a277;

import irvine.oeis.LinearRecurrence;

/**
 * A277253 <code>a(n) = a(n-2) + a(n-3) + a(n-4)</code> for <code>n&gt;3, a(0)=1, a(1)=a(2)=0, a(3)=2</code>.
 * @author Sean A. Irvine
 */
public class A277253 extends LinearRecurrence {

  /** Construct the sequence. */
  public A277253() {
    super(new long[] {1, 1, 1, 0}, new long[] {1, 0, 0, 2});
  }
}
