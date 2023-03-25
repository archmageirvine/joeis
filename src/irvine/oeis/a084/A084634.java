package irvine.oeis.a084;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A084634 Binomial transform of 1, 1, 1, 2, 2, 2, 2, 2, ...
 * @author Sean A. Irvine
 */
public class A084634 extends LinearRecurrence {

  /** Construct the sequence. */
  public A084634() {
    super(new long[] {-2, 7, -9, 5}, new long[] {1, 2, 4, 9});
  }
}
