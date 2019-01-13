package irvine.oeis.a232;

import irvine.oeis.LinearRecurrence;

/**
 * A232999.
 * @author Sean A. Irvine
 */
public class A232999 extends LinearRecurrence {

  /** Construct the sequence. */
  public A232999() {
    super(new long[] {-1, 2, 9, -8, -7, 6}, new long[] {16, 10, 36, 82, 272, 890});
  }
}
