package irvine.oeis.a165;

import irvine.oeis.LinearRecurrence;

/**
 * A165311 <code>a(0)=1, a(1)=4, a(n)=9*a(n-1)-16*a(n-2)</code> for <code>n&gt;1</code>.
 * @author Sean A. Irvine
 */
public class A165311 extends LinearRecurrence {

  /** Construct the sequence. */
  public A165311() {
    super(new long[] {-16, 9}, new long[] {1, 4});
  }
}
