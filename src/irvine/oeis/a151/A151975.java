package irvine.oeis.a151;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A151975 The number of ways one can flip seven consecutive tails (or heads) when flipping a coin n times.
 * @author Sean A. Irvine
 */
public class A151975 extends LinearRecurrence {

  /** Construct the sequence. */
  public A151975() {
    super(new long[] {-2, -1, -1, -1, -1, -1, -1, 3}, new long[] {0, 0, 0, 0, 0, 0, 0, 1});
  }
}
