package irvine.oeis.a237;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A237716 7-distance Pell sequence.
 * @author Sean A. Irvine
 */
public class A237716 extends LinearRecurrence {

  /** Construct the sequence. */
  public A237716() {
    super(new long[] {2, 0, 0, 0, 0, 1, 0}, new long[] {1, 1, 1, 1, 1, 1, 1});
  }
}
