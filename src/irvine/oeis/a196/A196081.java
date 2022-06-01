package irvine.oeis.a196;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A196081 Dungeons and Dragons Ability Modifier Sequence.
 * @author Sean A. Irvine
 */
public class A196081 extends LinearRecurrence {

  /** Construct the sequence. */
  public A196081() {
    super(new long[] {-1, 0, 1, 0, 1, 0}, new long[] {10, 0, 11, 0, 12, 1});
  }
}
