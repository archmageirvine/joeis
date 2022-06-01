package irvine.oeis.a274;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A274248 Row sums of A273751.
 * @author Sean A. Irvine
 */
public class A274248 extends LinearRecurrence {

  /** Construct the sequence. */
  public A274248() {
    super(new long[] {-1, 3, -2, -2, 3}, new long[] {1, 5, 16, 37, 72});
  }
}
