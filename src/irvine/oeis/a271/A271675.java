package irvine.oeis.a271;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A271675 Numbers m such that 3*m + 4 is a square.
 * @author Sean A. Irvine
 */
public class A271675 extends LinearRecurrence {

  /** Construct the sequence. */
  public A271675() {
    super(1, new long[] {1, -1, -2, 2, 1}, new long[] {0, 4, 7, 15, 20});
  }
}
