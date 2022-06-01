package irvine.oeis.a018;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A018210 Alkane (or paraffin) numbers l(9,n).
 * @author Sean A. Irvine
 */
public class A018210 extends LinearRecurrence {

  /** Construct the sequence. */
  public A018210() {
    super(new long[] {1, -4, 3, 8, -14, 0, 14, -8, -3, 4}, new long[] {1, 4, 16, 44, 110, 236, 472, 868, 1519, 2520});
  }
}
