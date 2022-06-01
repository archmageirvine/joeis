package irvine.oeis.a293;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A293996 Number of linear chord diagrams having n chords and no chord length larger than four.
 * @author Sean A. Irvine
 */
public class A293996 extends LinearRecurrence {

  /** Construct the sequence. */
  public A293996() {
    super(new long[] {-48, -108, -26, -18, 60, 11, 2, 2}, new long[] {1, 1, 3, 15, 105, 315, 1141, 4779});
  }
}
