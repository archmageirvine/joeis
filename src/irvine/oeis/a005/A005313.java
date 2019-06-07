package irvine.oeis.a005;

import irvine.oeis.LinearRecurrence;

/**
 * A005313 Number of triangular anti-Hadamard matrices of order <code>n</code>.
 * @author Sean A. Irvine
 */
public class A005313 extends LinearRecurrence {

  /** Construct the sequence. */
  public A005313() {
    super(new long[] {-1, 4, -3, -3, 4}, new long[] {1, 3, 6, 13, 29});
  }
}
