package irvine.oeis.a154;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A154617 Eleven times hexagonal numbers: a(n) = 11*n*(2*n-1).
 * @author Sean A. Irvine
 */
public class A154617 extends LinearRecurrence {

  /** Construct the sequence. */
  public A154617() {
    super(new long[] {1, -3, 3}, new long[] {0, 11, 66});
  }
}
