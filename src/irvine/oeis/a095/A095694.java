package irvine.oeis.a095;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A095694 T(n,3) diagonal of triangle in A095693.
 * @author Sean A. Irvine
 */
public class A095694 extends LinearRecurrence {

  /** Construct the sequence. */
  public A095694() {
    super(2, new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {1, 22, 130, 485, 1400, 3416, 7392});
  }
}
