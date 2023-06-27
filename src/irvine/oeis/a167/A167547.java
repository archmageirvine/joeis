package irvine.oeis.a167;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A167547 The fourth row of the ED1 array A167546.
 * @author Sean A. Irvine
 */
public class A167547 extends LinearRecurrence {

  /** Construct the sequence. */
  public A167547() {
    super(1, new long[] {-1, 4, -6, 4}, new long[] {6, 48, 160, 384});
  }
}
