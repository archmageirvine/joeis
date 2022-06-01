package irvine.oeis.a164;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A164131 Numbers n such that n^2 == 2 (mod 31).
 * @author Sean A. Irvine
 */
public class A164131 extends LinearRecurrence {

  /** Construct the sequence. */
  public A164131() {
    super(new long[] {-1, 1, 1}, new long[] {8, 23, 39});
  }
}
