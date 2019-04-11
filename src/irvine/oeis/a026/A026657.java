package irvine.oeis.a026;

import irvine.oeis.LinearRecurrence;

/**
 * A026657 Sum{T(i,j)}, 0&lt;=i&lt;=n, <code>0&lt;=j&lt;=n,</code> T given by A026648.
 * @author Sean A. Irvine
 */
public class A026657 extends LinearRecurrence {

  /** Construct the sequence. */
  public A026657() {
    super(new long[] {-2, 2, -4, 4, 1}, new long[] {1, 3, 8, 18, 40});
  }
}
