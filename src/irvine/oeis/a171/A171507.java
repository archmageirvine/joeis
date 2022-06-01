package irvine.oeis.a171;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A171507 a(n) = (5*2^(n+1)-9-(-1)^n)/6-2*n.
 * @author Sean A. Irvine
 */
public class A171507 extends LinearRecurrence {

  /** Construct the sequence. */
  public A171507() {
    super(new long[] {2, -3, -1, 3}, new long[] {0, 0, 1, 6});
  }
}
