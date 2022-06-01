package irvine.oeis.a127;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A127931 Numbers k such that 13 divides 11*k + 2^k.
 * @author Sean A. Irvine
 */
public class A127931 extends LinearRecurrence {

  /** Construct the sequence. */
  public A127931() {
    super(new long[] {-1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1}, new long[] {1, 2, 6, 9, 23, 29, 70, 72, 103, 112, 128, 147, 157});
  }
}
