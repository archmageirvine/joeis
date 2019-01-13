package irvine.oeis.a279;

import irvine.oeis.LinearRecurrence;

/**
 * A279673.
 * @author Sean A. Irvine
 */
public class A279673 extends LinearRecurrence {

  /** Construct the sequence. */
  public A279673() {
    super(new long[] {4, -1, 2}, new long[] {1, 3, 9});
  }
}
