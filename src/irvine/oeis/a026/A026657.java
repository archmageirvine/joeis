package irvine.oeis.a026;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A026657 Sum{T(i,j)}, 0&lt;=i&lt;=n, 0&lt;=j&lt;=n, T given by A026648.
 * @author Sean A. Irvine
 */
public class A026657 extends LinearRecurrence {

  /** Construct the sequence. */
  public A026657() {
    super(new long[] {-2, 2, -4, 4, 1}, new long[] {1, 3, 8, 18, 40});
  }
}
