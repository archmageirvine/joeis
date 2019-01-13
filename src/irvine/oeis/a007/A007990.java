package irvine.oeis.a007;

import irvine.oeis.LinearRecurrence;

/**
 * A007990.
 * @author Sean A. Irvine
 */
public class A007990 extends LinearRecurrence {

  /** Construct the sequence. */
  public A007990() {
    super(new long[] {1, -2, -3, 6, 5, -4, -10, -4, 12, 8, 0, -8, -12, 4, 10, 4, -5, -6, 3, 2},
      new long[] {3, 6, 18, 42, 94, 180, 348, 602, 1047, 1692, 2737, 4194, 6426, 9450, 13863, 19716, 27933, 38616, 53160, 71748}
    );
  }
}
