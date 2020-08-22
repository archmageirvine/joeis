package irvine.oeis.a008;

import irvine.oeis.LinearRecurrence;

/**
 * A008630 Molien series for A_7.
 * @author Sean A. Irvine
 */
public class A008630 extends LinearRecurrence {

  /** Construct the sequence. */
  public A008630() {
    super(new long[] {1, -1, -1, -1, 1, 2, 1, 0, -1, -1, -1, 0, -1, 1, 0, 1, 1, 1, 0, -1, -2, -1, 1, 1, 1},
      new long[] {1, 1, 2, 3, 5, 7, 11, 15, 21, 28, 38, 49, 65, 82, 105, 131, 164, 201, 248, 300, 364, 437, 523, 620, 736});
  }
}

