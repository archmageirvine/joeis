package irvine.oeis.a279;

import irvine.oeis.LinearRecurrence;

/**
 * A279318.
 * @author Sean A. Irvine
 */
public class A279318 extends LinearRecurrence {

  /** Construct the sequence. */
  public A279318() {
    super(new long[] {-1, 1, 0, 0, 0, 0, 1}, new long[] {3, 2, 1, 0, 5, 4, 9});
  }
}
