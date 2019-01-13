package irvine.oeis.a055;

import irvine.oeis.LinearRecurrence;

/**
 * A055438.
 * @author Sean A. Irvine
 */
public class A055438 extends LinearRecurrence {

  /** Construct the sequence. */
  public A055438() {
    super(new long[] {1, -3, 3}, new long[] {101, 402, 903});
  }
}
