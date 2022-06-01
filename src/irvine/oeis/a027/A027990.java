package irvine.oeis.a027;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A027990 Sum{T(n,k)*T(n,2n-k)}, 0&lt;=k&lt;=n, T given by A027926.
 * @author Sean A. Irvine
 */
public class A027990 extends LinearRecurrence {

  /** Construct the sequence. */
  public A027990() {
    super(new long[] {-1, 5, -5, -5, 5}, new long[] {1, 2, 7, 21, 65});
  }
}
