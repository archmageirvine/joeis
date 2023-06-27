package irvine.oeis.a059;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A059224 a(n) = 2^(n-3)*(n + 3)*(2*n - 3).
 * @author Sean A. Irvine
 */
public class A059224 extends LinearRecurrence {

  /** Construct the sequence. */
  public A059224() {
    super(3, new long[] {8, -12, 6}, new long[] {18, 70, 224});
  }
}
