package irvine.oeis.a213;

import irvine.oeis.LinearRecurrence;

/**
 * A213485.
 * @author Sean A. Irvine
 */
public class A213485 extends LinearRecurrence {

  /** Construct the sequence. */
  public A213485() {
    super(new long[] {-1, 4, -7, 8, -7, 4}, new long[] {0, 4, 20, 54, 109, 191});
  }
}
