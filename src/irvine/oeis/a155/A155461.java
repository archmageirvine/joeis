package irvine.oeis.a155;

import irvine.oeis.LinearRecurrence;

/**
 * A155461 a(n) = n^2 + 52*n + 30.
 * @author Sean A. Irvine
 */
public class A155461 extends LinearRecurrence {

  /** Construct the sequence. */
  public A155461() {
    super(new long[] {1, -3, 3}, new long[] {30, 83, 138});
  }
}
