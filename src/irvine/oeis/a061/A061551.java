package irvine.oeis.a061;

import irvine.oeis.LinearRecurrence;

/**
 * A061551.
 * @author Sean A. Irvine
 */
public class A061551 extends LinearRecurrence {

  /** Construct the sequence. */
  public A061551() {
    super(new long[] {-1, -2, 3, 1}, new long[] {1, 1, 2, 3});
  }
}
