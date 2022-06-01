package irvine.oeis.a161;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A161711 a(n) = (-4*n^3 + 27*n^2 - 20*n + 3)/3.
 * @author Sean A. Irvine
 */
public class A161711 extends LinearRecurrence {

  /** Construct the sequence. */
  public A161711() {
    super(new long[] {-1, 4, -6, 4}, new long[] {1, 2, 13, 26});
  }
}
