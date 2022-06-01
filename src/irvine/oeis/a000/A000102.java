package irvine.oeis.a000;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A000102 a(n) = number of compositions of n in which the maximum part size is 4.
 * @author Sean A. Irvine
 */
public class A000102 extends LinearRecurrence {

  /** Construct the sequence. */
  public A000102() {
    super(new long[] {-1, -2, -3, -2, 0, 1, 2}, new long[] {0, 0, 0, 0, 1, 2, 5});
  }
}

