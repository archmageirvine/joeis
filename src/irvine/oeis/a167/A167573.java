package irvine.oeis.a167;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A167573 The third row of the ED3 array A167572.
 * @author Sean A. Irvine
 */
public class A167573 extends LinearRecurrence {

  /** Construct the sequence. */
  public A167573() {
    super(new long[] {1, -3, 3}, new long[] {23, 83, 183});
  }
}
