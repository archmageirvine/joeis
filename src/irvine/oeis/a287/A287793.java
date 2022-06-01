package irvine.oeis.a287;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A287793 Eight steps forward, seven steps back.
 * @author Sean A. Irvine
 */
public class A287793 extends LinearRecurrence {

  /** Construct the sequence. */
  public A287793() {
    super(new long[] {-1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1}, new long[] {0, 1, 2, 3, 4, 5, 6, 7, 8, 7, 6, 5, 4, 3, 2, 1});
  }
}
