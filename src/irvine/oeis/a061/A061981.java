package irvine.oeis.a061;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A061981 a(n) = 3^n - 2n - 1.
 * @author Sean A. Irvine
 */
public class A061981 extends LinearRecurrence {

  /** Construct the sequence. */
  public A061981() {
    super(new long[] {3, -7, 5}, new long[] {0, 0, 4});
  }
}
