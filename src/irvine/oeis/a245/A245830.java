package irvine.oeis.a245;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A245830 The Szeged index of a benzenoid consisting of a linear chain of n hexagons.
 * @author Sean A. Irvine
 */
public class A245830 extends LinearRecurrence {

  /** Construct the sequence. */
  public A245830() {
    super(1, new long[] {-1, 4, -6, 4}, new long[] {54, 243, 656, 1381});
  }
}
