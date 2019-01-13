package irvine.oeis.a062;

import irvine.oeis.LinearRecurrence;

/**
 * A062828.
 * @author Sean A. Irvine
 */
public class A062828 extends LinearRecurrence {

  /** Construct the sequence. */
  public A062828() {
    super(new long[] {-1, 0, 0, 0, 2, 0, 0, 0}, new long[] {1, 1, 6, 2, 5, 3, 14, 4});
  }
}
