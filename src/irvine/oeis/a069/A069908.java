package irvine.oeis.a069;

import irvine.oeis.LinearRecurrence;

/**
 * A069908 Numbers congruent to +-2, +-3, +-4 or +-5 mod 16.
 * @author Sean A. Irvine
 */
public class A069908 extends LinearRecurrence {

  /** Construct the sequence. */
  public A069908() {
    super(new long[] {-1, 1, 0, 0, 0, 0, 0, 0, 1}, new long[] {2, 3, 4, 5, 11, 12, 13, 14, 18});
  }
}
