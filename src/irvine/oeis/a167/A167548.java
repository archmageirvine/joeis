package irvine.oeis.a167;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A167548 The fifth row of the ED1 array A167546.
 * @author Sean A. Irvine
 */
public class A167548 extends LinearRecurrence {

  /** Construct the sequence. */
  public A167548() {
    super(1, new long[] {1, -5, 10, -10, 5}, new long[] {24, 240, 960, 2688, 6144});
  }
}
