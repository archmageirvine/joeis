package irvine.oeis.a005;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A005313 Maximal sum of inverse squares of the singular values of triangular anti-Hadamard matrices of order n.
 * @author Sean A. Irvine
 */
public class A005313 extends LinearRecurrence {

  /** Construct the sequence. */
  public A005313() {
    super(1, new long[] {-1, 4, -3, -3, 4}, new long[] {1, 3, 6, 13, 29});
  }
}
