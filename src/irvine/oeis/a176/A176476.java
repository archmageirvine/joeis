package irvine.oeis.a176;

import irvine.oeis.LinearRecurrence;

/**
 * A176476.
 * @author Sean A. Irvine
 */
public class A176476 extends LinearRecurrence {

  /** Construct the sequence. */
  public A176476() {
    super(new long[] {-1, 5, -9, 6}, new long[] {1, 6, 27, 113});
  }
}
