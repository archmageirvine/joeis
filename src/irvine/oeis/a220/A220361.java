package irvine.oeis.a220;

import irvine.oeis.LinearRecurrence;

/**
 * A220361.
 * @author Sean A. Irvine
 */
public class A220361 extends LinearRecurrence {

  /** Construct the sequence. */
  public A220361() {
    super(new long[] {-1, -3, 6, 3}, new long[] {1, 7, 28, 123});
  }
}
