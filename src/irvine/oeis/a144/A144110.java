package irvine.oeis.a144;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A144110 Period 6: repeat [2, 2, 2, 1, 1, 1].
 * @author Sean A. Irvine
 */
public class A144110 extends LinearRecurrence {

  /** Construct the sequence. */
  public A144110() {
    super(new long[] {1, -1, 0, 1}, new long[] {2, 2, 2, 1});
  }
}
