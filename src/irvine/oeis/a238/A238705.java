package irvine.oeis.a238;

import irvine.oeis.LinearRecurrence;

/**
 * A238705 Number of partitions of <code>4n</code> into 4 parts with smallest part <code>= 1</code>.
 * @author Sean A. Irvine
 */
public class A238705 extends LinearRecurrence {

  /** Construct the sequence. */
  public A238705() {
    super(new long[] {1, -2, 1, -1, 2}, new long[] {1, 4, 10, 19, 30});
  }
}
