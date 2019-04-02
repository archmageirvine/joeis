package irvine.oeis.a136;

import irvine.oeis.LinearRecurrence;

/**
 * A136315 Period 10: repeat 1, 2, 3, 6, 5, 0, 7, 4, 9, 8 .
 * @author Sean A. Irvine
 */
public class A136315 extends LinearRecurrence {

  /** Construct the sequence. */
  public A136315() {
    super(new long[] {1, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[] {1, 2, 3, 6, 5, 0, 7, 4, 9, 8});
  }
}
