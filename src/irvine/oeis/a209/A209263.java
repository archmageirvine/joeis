package irvine.oeis.a209;

import irvine.oeis.LinearRecurrence;

/**
 * A209263 a(n) = 1 + 2*n^2 + 3*n^3 + 4*n^4 + 5*n^5.
 * @author Sean A. Irvine
 */
public class A209263 extends LinearRecurrence {

  /** Construct the sequence. */
  public A209263() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {1, 15, 257, 1639, 6369, 18551});
  }
}
