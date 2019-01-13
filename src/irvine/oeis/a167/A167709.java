package irvine.oeis.a167;

import irvine.oeis.LinearRecurrence;

/**
 * A167709.
 * @author Sean A. Irvine
 */
public class A167709 extends LinearRecurrence {

  /** Construct the sequence. */
  public A167709() {
    super(new long[] {-1, 0, 0, 0, 0, 340, 0, 0, 0, 0}, new long[] {0, 1, 15, 24, 220, 351, 560, 5124, 8175, 74801});
  }
}
