package irvine.oeis.a293;

import irvine.oeis.LinearRecurrence;

/**
 * A293995 Number of linear chord diagrams having n chords and no chord length larger than three.
 * @author Sean A. Irvine
 */
public class A293995 extends LinearRecurrence {

  /** Construct the sequence. */
  public A293995() {
    super(new long[] {-6, 8, 1, 2}, new long[] {1, 1, 3, 15});
  }
}
