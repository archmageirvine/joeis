package irvine.oeis.a157;

import irvine.oeis.LinearRecurrence;

/**
 * A157855 103680000n^2 - 46108800n + 5126401.
 * @author Sean A. Irvine
 */
public class A157855 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157855() {
    super(new long[] {1, -3, 3}, new long[] {62697601, 327628801, 799920001});
  }
}
