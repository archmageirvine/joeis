package irvine.oeis.a018;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A018211 Alkane (or paraffin) numbers l(10,n).
 * @author Sean A. Irvine
 */
public class A018211 extends LinearRecurrence {

  /** Construct the sequence. */
  public A018211() {
    super(new long[] {-1, 4, -2, -12, 17, 8, -28, 8, 17, -12, -2, 4}, new long[] {1, 4, 20, 60, 170, 396, 868, 1716, 3235, 5720, 9752, 15912});
  }
}
