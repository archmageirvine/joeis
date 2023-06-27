package irvine.oeis.a195;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A195019 Multiples of 3 and of 4 interleaved: a(2*n-1) = 3*n, a(2*n) = 4*n.
 * @author Sean A. Irvine
 */
public class A195019 extends LinearRecurrence {

  /** Construct the sequence. */
  public A195019() {
    super(1, new long[] {-1, 0, 2, 0}, new long[] {3, 4, 6, 8});
  }
}
