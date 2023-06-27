package irvine.oeis.a060;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A060824 4-wave sequence beginning with 2s.
 * @author Sean A. Irvine
 */
public class A060824 extends LinearRecurrence {

  /** Construct the sequence. */
  public A060824() {
    super(2, new long[] {-1, 1, -1, 0, 0, 0, 3, -3, 3, -1, 1}, new long[] {2, 2, 2, 2, 4, 6, 8, 14, 18, 20, 38});
  }
}
