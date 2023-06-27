package irvine.oeis.a258;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A258054 Circle of fifths cycle (counterclockwise).
 * @author Sean A. Irvine
 */
public class A258054 extends LinearRecurrence {

  /** Construct the sequence. */
  public A258054() {
    super(1, new long[] {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[] {1, 6, 11, 4, 9, 2, 7, 12, 5, 10, 3, 8});
  }
}
