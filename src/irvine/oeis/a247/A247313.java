package irvine.oeis.a247;

import irvine.oeis.LinearRecurrence;

/**
 * A247313 <code>a(n) = 5*a(n-1) - 2^n</code> for <code>n&gt;0, a(0)=1</code>.
 * @author Sean A. Irvine
 */
public class A247313 extends LinearRecurrence {

  /** Construct the sequence. */
  public A247313() {
    super(new long[] {-10, 7}, new long[] {1, 3});
  }
}
