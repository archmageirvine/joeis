package irvine.oeis.a218;

import irvine.oeis.LinearRecurrence;

/**
 * A218987 Power ceiling sequence of 2+sqrt(7).
 * @author Sean A. Irvine
 */
public class A218987 extends LinearRecurrence {

  /** Construct the sequence. */
  public A218987() {
    super(new long[] {-3, -1, 5}, new long[] {5, 24, 112});
  }
}
