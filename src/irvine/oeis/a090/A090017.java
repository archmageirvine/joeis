package irvine.oeis.a090;

import irvine.oeis.LinearRecurrence;

/**
 * A090017 <code>a(n) = 4*a(n-1) + 2*a(n-2)</code> for <code>n&gt;1, a(0)=0, a(1)=1</code>.
 * @author Sean A. Irvine
 */
public class A090017 extends LinearRecurrence {

  /** Construct the sequence. */
  public A090017() {
    super(new long[] {2, 4}, new long[] {0, 1});
  }
}
