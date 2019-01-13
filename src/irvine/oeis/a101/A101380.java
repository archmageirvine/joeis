package irvine.oeis.a101;

import irvine.oeis.LinearRecurrence;

/**
 * A101380.
 * @author Sean A. Irvine
 */
public class A101380 extends LinearRecurrence {

  /** Construct the sequence. */
  public A101380() {
    super(new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {0, 1, 29, 288, 1540, 5725, 16821});
  }
}
