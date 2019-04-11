package irvine.oeis.a069;

import irvine.oeis.LinearRecurrence;

/**
 * A069908 Numbers congruent to <code>+-2, +-3, +-4</code> or <code>+-5 mod 16</code>.
 * @author Sean A. Irvine
 */
public class A069908 extends LinearRecurrence {

  /** Construct the sequence. */
  public A069908() {
    super(new long[] {-1, 1, 0, 0, 0, 0, 0, 0, 1}, new long[] {2, 3, 4, 5, 11, 12, 13, 14, 18});
  }
}
