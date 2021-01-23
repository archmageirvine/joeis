package irvine.oeis.a030;

import irvine.oeis.LinearRecurrence;

/**
 * A030110 a(n) = 2^n - n^2 + 1.
 * @author Sean A. Irvine
 */
public class A030110 extends LinearRecurrence {

  /** Construct the sequence. */
  public A030110() {
    super(new long[] {-2, 7, -9, 5}, new long[] {2, 2, 1, 0});
  }
}
