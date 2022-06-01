package irvine.oeis.a054;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A054417 Number of connected 3 X n binary matrices with rightmost column [1,0,0]'.
 * @author Sean A. Irvine
 */
public class A054417 extends LinearRecurrence {

  /** Construct the sequence. */
  public A054417() {
    super(new long[] {5, -3, 7}, new long[] {1, 5, 37});
  }
}
