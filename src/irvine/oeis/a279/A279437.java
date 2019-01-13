package irvine.oeis.a279;

import irvine.oeis.LinearRecurrence;

/**
 * A279437.
 * @author Sean A. Irvine
 */
public class A279437 extends LinearRecurrence {

  /** Construct the sequence. */
  public A279437() {
    super(new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {0, 4, 78, 528, 2200, 6900, 17934});
  }
}
