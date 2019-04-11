package irvine.oeis.a274;

import irvine.oeis.LinearRecurrence;

/**
 * A274250 Number of partitions of <code>n^2</code> into at most three parts.
 * @author Sean A. Irvine
 */
public class A274250 extends LinearRecurrence {

  /** Construct the sequence. */
  public A274250() {
    super(new long[] {1, -3, 2, 1, 0, -1, -2, 3}, new long[] {1, 1, 4, 12, 30, 65, 127, 225});
  }
}
