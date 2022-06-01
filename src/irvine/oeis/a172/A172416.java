package irvine.oeis.a172;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A172416 a(n) = 5*2^n/9 + 1/4 + (-1)^n*(n/6 + 7/36).
 * @author Sean A. Irvine
 */
public class A172416 extends LinearRecurrence {

  /** Construct the sequence. */
  public A172416() {
    super(new long[] {-2, -1, 3, 1}, new long[] {1, 1, 3, 4});
  }
}
