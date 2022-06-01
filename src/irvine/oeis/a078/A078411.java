package irvine.oeis.a078;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A078411 Expansion of Molien series for a certain 4-D group of order 48.
 * @author Sean A. Irvine
 */
public class A078411 extends LinearRecurrence {

  /** Construct the sequence. */
  public A078411() {
    super(new long[] {-1, 1, 1, 0, 0, -2, 0, 0, 1, 1}, new long[] {1, 1, 3, 5, 10, 14, 23, 31, 46, 59});
  }
}
