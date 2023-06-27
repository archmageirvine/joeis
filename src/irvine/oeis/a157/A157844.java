package irvine.oeis.a157;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A157844 103680000n^2 - 161251200n + 62697601.
 * @author Sean A. Irvine
 */
public class A157844 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157844() {
    super(1, new long[] {1, -3, 3}, new long[] {5126401, 154915201, 512064001});
  }
}
