package irvine.oeis.a118;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A118057 a(n) = 8*n^2 - 4*n - 3.
 * @author Sean A. Irvine
 */
public class A118057 extends LinearRecurrence {

  /** Construct the sequence. */
  public A118057() {
    super(1, new long[] {1, -3, 3}, new long[] {1, 21, 57});
  }
}
