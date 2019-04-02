package irvine.oeis.a255;

import irvine.oeis.LinearRecurrence;

/**
 * A255347 a(n) = n * (1 - (-1)^(n/4) / 4) if n divisible by 4, a(n) = n otherwise.
 * @author Sean A. Irvine
 */
public class A255347 extends LinearRecurrence {

  /** Construct the sequence. */
  public A255347() {
    super(new long[] {-1, 2, -1, 0, -2, 4, -2, 0, -1, 2}, new long[] {0, 1, 2, 3, 5, 5, 6, 7, 6, 9});
  }
}
