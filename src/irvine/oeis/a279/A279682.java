package irvine.oeis.a279;

import irvine.oeis.LinearRecurrence;

/**
 * A279682.
 * @author Sean A. Irvine
 */
public class A279682 extends LinearRecurrence {

  /** Construct the sequence. */
  public A279682() {
    super(new long[] {-8, -2, 1, -1, 3}, new long[] {1, 3, 9, 19, 49});
  }
}
