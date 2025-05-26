package irvine.oeis.a158;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A158420 a(n) = 1024*n^2 - 2*n.
 * @author Sean A. Irvine
 */
public class A158420 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158420() {
    super(1, new long[] {1, -3, 3}, new long[] {1022, 4092, 9210});
  }
}
