package irvine.oeis.a242;

import irvine.oeis.LinearRecurrence;

/**
 * A242727 Sum of the third largest parts of the partitions of <code>4n</code> into 4 parts.
 * @author Sean A. Irvine
 */
public class A242727 extends LinearRecurrence {

  /** Construct the sequence. */
  public A242727() {
    super(new long[] {1, -3, 3, -3, 6, -6, 3, -3, 3}, new long[] {1, 7, 29, 86, 198, 396, 719, 1203, 1899});
  }
}
