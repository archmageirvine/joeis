package irvine.oeis.a027;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A027383 a(2*n) = 3*2^n - 2; a(2*n+1) = 2^(n+2) - 2.
 * @author Sean A. Irvine
 */
public class A027383 extends LinearRecurrence {

  /** Construct the sequence. */
  public A027383() {
    super(new long[] {-2, 2, 1}, new long[] {1, 2, 4});
  }
}
