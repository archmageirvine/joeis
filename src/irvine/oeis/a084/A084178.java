package irvine.oeis.a084;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A084178 Inverse binomial transform of Fibonacci oblongs.
 * @author Sean A. Irvine
 */
public class A084178 extends LinearRecurrence {

  /** Construct the sequence. */
  public A084178() {
    super(new long[] {2, 3, -1}, new long[] {0, 1, 0});
  }
}
