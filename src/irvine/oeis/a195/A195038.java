package irvine.oeis.a195;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A195038 41 times triangular numbers.
 * @author Sean A. Irvine
 */
public class A195038 extends LinearRecurrence {

  /** Construct the sequence. */
  public A195038() {
    super(new long[] {1, -3, 3}, new long[] {0, 41, 123});
  }
}
