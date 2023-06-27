package irvine.oeis.a136;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A136017 a(n) = 36n^2 - 1.
 * @author Sean A. Irvine
 */
public class A136017 extends LinearRecurrence {

  /** Construct the sequence. */
  public A136017() {
    super(1, new long[] {1, -3, 3}, new long[] {35, 143, 323});
  }
}
