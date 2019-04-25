package irvine.oeis.a117;

import irvine.oeis.LinearRecurrence;

/**
 * A117142 Number of partitions of n in which <code>any</code> two parts differ by at most 2.
 * @author Sean A. Irvine
 */
public class A117142 extends LinearRecurrence {

  /** Construct the sequence. */
  public A117142() {
    super(new long[] {1, -1, -2, 2, 1}, new long[] {1, 2, 3, 5, 6});
  }
}
