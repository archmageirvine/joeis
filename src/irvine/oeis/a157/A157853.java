package irvine.oeis.a157;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A157853 a(n) = 3600*n^2 - 1601*n + 178.
 * @author Sean A. Irvine
 */
public class A157853 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157853() {
    super(1, new long[] {1, -3, 3}, new long[] {2177, 11376, 27775});
  }
}
