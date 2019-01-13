package irvine.oeis.a279;

import irvine.oeis.LinearRecurrence;

/**
 * A279674.
 * @author Sean A. Irvine
 */
public class A279674 extends LinearRecurrence {

  /** Construct the sequence. */
  public A279674() {
    super(new long[] {4, -1, 2}, new long[] {1, 3, 5});
  }
}
