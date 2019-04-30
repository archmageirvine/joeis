package irvine.oeis.a018;

import irvine.oeis.LinearRecurrence;

/**
 * A018213 Alkane (or paraffin) numbers <code>l(12,n)</code>.
 * @author Sean A. Irvine
 */
public class A018213 extends LinearRecurrence {

  /** Construct the sequence. */
  public A018213() {
    super(new long[] {-1, 5, -5, -15, 35, 1, -65, 45, 45, -65, 1, 35, -15, -5, 5}, new long[] {1, 5, 30, 110, 365, 1001, 2520, 5720, 12190, 24310, 46252, 83980, 147070, 248710, 408760});
  }
}
