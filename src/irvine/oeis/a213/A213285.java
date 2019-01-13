package irvine.oeis.a213;

import irvine.oeis.LinearRecurrence;

/**
 * A213285.
 * @author Sean A. Irvine
 */
public class A213285 extends LinearRecurrence {

  /** Construct the sequence. */
  public A213285() {
    super(new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {0, 1, 27, 165, 712, 2535, 8151});
  }
}
