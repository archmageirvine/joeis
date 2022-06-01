package irvine.oeis.a051;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A051869 17-gonal (or heptadecagonal) numbers: n*(15*n-13)/2.
 * @author Sean A. Irvine
 */
public class A051869 extends LinearRecurrence {

  /** Construct the sequence. */
  public A051869() {
    super(new long[] {1, -3, 3}, new long[] {0, 1, 17});
  }
}
