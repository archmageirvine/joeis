package irvine.oeis.a277;

import irvine.oeis.LinearRecurrence;

/**
 * A277361.
 * @author Sean A. Irvine
 */
public class A277361 extends LinearRecurrence {

  /** Construct the sequence. */
  public A277361() {
    super(new long[] {-1, -4, -2, 8, 5, -8, -2, 4}, new long[] {0, 0, 1, 2, 11, 28, 80, 194});
  }
}
