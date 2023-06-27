package irvine.oeis.a254;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A254674 Indices of heptagonal numbers (A000566) which are also centered triangular numbers (A005448).
 * @author Sean A. Irvine
 */
public class A254674 extends LinearRecurrence {

  /** Construct the sequence. */
  public A254674() {
    super(1, new long[] {1, -1, -62, 62, 1}, new long[] {1, 10, 34, 601, 2089});
  }
}
