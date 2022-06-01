package irvine.oeis.a083;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A083374 a(n) = n^2 * (n^2 - 1)/2.
 * @author Sean A. Irvine
 */
public class A083374 extends LinearRecurrence {

  /** Construct the sequence. */
  public A083374() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {0, 6, 36, 120, 300});
  }
}
