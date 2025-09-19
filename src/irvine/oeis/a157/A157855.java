package irvine.oeis.a157;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A157855 a(n) = 103680000*n^2 - 46108800*n + 5126401.
 * @author Sean A. Irvine
 */
public class A157855 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157855() {
    super(1, new long[] {1, -3, 3}, new long[] {62697601, 327628801, 799920001});
  }
}
