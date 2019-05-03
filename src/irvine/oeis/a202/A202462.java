package irvine.oeis.a202;

import irvine.oeis.LinearRecurrence;

/**
 * A202462 <code>Sum{F(i,j) : 1&lt;=i&lt;=n, 1&lt;=j&lt;=n}</code>, where F is the Fibonacci fusion array, <code>A202453</code>.
 * @author Sean A. Irvine
 */
public class A202462 extends LinearRecurrence {

  /** Construct the sequence. */
  public A202462() {
    super(new long[] {1, -3, -2, 10, -4, -6, 5}, new long[] {1, 5, 21, 70, 214, 614, 1703});
  }
}
