package irvine.oeis.a279;

import irvine.oeis.LinearRecurrence;

/**
 * A279316 Period <code>7</code>: repeat <code>[0, 1, 2, 3, 3, 2, 1]</code>.
 * @author Sean A. Irvine
 */
public class A279316 extends LinearRecurrence {

  /** Construct the sequence. */
  public A279316() {
    super(new long[] {1, 0, 0, 0, 0, 0, 0}, new long[] {0, 1, 2, 3, 3, 2, 1});
  }
}
