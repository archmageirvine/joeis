package irvine.oeis.a113;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A113338 Positive integers of the form (18*m^2+1)/11.
 * @author Sean A. Irvine
 */
public class A113338 extends LinearRecurrence {

  /** Construct the sequence. */
  public A113338() {
    super(1, new long[] {1, -1, -2, 2, 1}, new long[] {41, 59, 419, 473, 1193});
  }
}
