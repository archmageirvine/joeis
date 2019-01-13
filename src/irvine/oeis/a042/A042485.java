package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042485.
 * @author Sean A. Irvine
 */
public class A042485 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042485() {
    super(new long[] {-1, 0, 0, 0, 222, 0, 0, 0}, new long[] {1, 1, 3, 4, 219, 223, 665, 888});
  }
}
