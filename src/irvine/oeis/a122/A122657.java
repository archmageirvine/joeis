package irvine.oeis.a122;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A122657 a(n) = if n mod 2 = 1 then (n^2-1)*n^3/4 else n^5/4.
 * @author Sean A. Irvine
 */
public class A122657 extends LinearRecurrence {

  /** Construct the sequence. */
  public A122657() {
    super(new long[] {-1, 2, 3, -8, -2, 12, -2, -8, 3, 2}, new long[] {0, 0, 8, 54, 256, 750, 1944, 4116, 8192, 14580});
  }
}
