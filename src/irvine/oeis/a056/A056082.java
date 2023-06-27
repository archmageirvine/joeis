package irvine.oeis.a056;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A056082 Numbers k such that k^4 == 1 (mod 5^3).
 * @author Sean A. Irvine
 */
public class A056082 extends LinearRecurrence {

  /** Construct the sequence. */
  public A056082() {
    super(1, new long[] {-1, 1, 0, 0, 1}, new long[] {1, 57, 68, 124, 126});
  }
}
