package irvine.oeis.a240;

import irvine.oeis.LinearRecurrence;

/**
 * A240847 <code>a(n) = 2*a(n-1) + a(n-2) - 2*a(n-3) - a(n-4)</code> for <code>n&gt;3, a(0)=a(1)=a(3)=0, a(2)=1</code>.
 * @author Sean A. Irvine
 */
public class A240847 extends LinearRecurrence {

  /** Construct the sequence. */
  public A240847() {
    super(new long[] {-1, -2, 1, 2}, new long[] {0, 0, 1, 0});
  }
}
