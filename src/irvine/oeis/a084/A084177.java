package irvine.oeis.a084;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A084177 Binomial transform of Jacobsthal oblongs.
 * @author Sean A. Irvine
 */
public class A084177 extends LinearRecurrence {

  /** Construct the sequence. */
  public A084177() {
    super(new long[] {-10, -3, 6}, new long[] {0, 1, 5});
  }
}
