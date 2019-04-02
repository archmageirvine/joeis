package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041204 Numerators of continued fraction convergents to sqrt(113).
 * @author Sean A. Irvine
 */
public class A041204 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041204() {
    super(new long[] {1, 0, 0, 0, 0, 0, 0, 0, 0, 1552, 0, 0, 0, 0, 0, 0, 0, 0}, new long[] {10, 11, 21, 32, 85, 202, 287, 489, 776, 16009, 16785, 32794, 49579, 131952, 313483, 445435, 758918, 1204353});
  }
}
