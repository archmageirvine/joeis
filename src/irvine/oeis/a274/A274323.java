package irvine.oeis.a274;

import irvine.oeis.LinearRecurrence;

/**
 * A274323 Number of partitions of <code>n^4</code> into at most two parts.
 * @author Sean A. Irvine
 */
public class A274323 extends LinearRecurrence {

  /** Construct the sequence. */
  public A274323() {
    super(new long[] {1, -4, 5, 0, -5, 4}, new long[] {1, 1, 9, 41, 129, 313});
  }
}
