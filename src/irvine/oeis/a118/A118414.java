package irvine.oeis.a118;

import irvine.oeis.LinearRecurrence;

/**
 * A118414 a(n) = (2*n - 1) * (2^n - 1).
 * @author Sean A. Irvine
 */
public class A118414 extends LinearRecurrence {

  /** Construct the sequence. */
  public A118414() {
    super(new long[] {-4, 12, -13, 6}, new long[] {1, 9, 35, 105});
  }
}
