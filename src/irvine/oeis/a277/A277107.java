package irvine.oeis.a277;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A277107 a(n) = 16*3^n - 48.
 * @author Sean A. Irvine
 */
public class A277107 extends LinearRecurrence {

  /** Construct the sequence. */
  public A277107() {
    super(1, new long[] {-3, 4}, new long[] {0, 96});
  }
}
