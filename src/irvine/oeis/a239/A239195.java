package irvine.oeis.a239;

import irvine.oeis.LinearRecurrence;

/**
 * A239195 Sum of the next to smallest parts in the partitions of <code>4n</code> into 4 parts with smallest part <code>= 1</code>.
 * @author Sean A. Irvine
 */
public class A239195 extends LinearRecurrence {

  /** Construct the sequence. */
  public A239195() {
    super(new long[] {-1, 2, -1, 2, -4, 2, -1, 2}, new long[] {1, 5, 17, 42, 78, 134, 215, 315});
  }
}
