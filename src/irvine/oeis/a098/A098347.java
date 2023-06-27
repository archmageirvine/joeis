package irvine.oeis.a098;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A098347 A sequence derived from a Ferrers graph partition of 16.
 * @author Sean A. Irvine
 */
public class A098347 extends LinearRecurrence {

  /** Construct the sequence. */
  public A098347() {
    super(1, new long[] {-3, 3, 3}, new long[] {1, 5, 16});
  }
}
