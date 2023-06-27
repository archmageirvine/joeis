package irvine.oeis.a274;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A274756 Values of n such that 2*n+1 and 6*n+1 are both triangular numbers.
 * @author Sean A. Irvine
 */
public class A274756 extends LinearRecurrence {

  /** Construct the sequence. */
  public A274756() {
    super(1, new long[] {1, -1, -37634, 37634, 1}, new long[] {0, 945, 13167, 35578242, 495540990});
  }
}
