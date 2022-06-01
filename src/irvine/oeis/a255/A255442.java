package irvine.oeis.a255;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A255442 a(n) = A255304(2^n-1).
 * @author Sean A. Irvine
 */
public class A255442 extends LinearRecurrence {

  /** Construct the sequence. */
  public A255442() {
    super(new long[] {-9, 3, 3}, new long[] {1, 5, 15});
  }
}
