package irvine.oeis.a000;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A000100 a(n) is the number of compositions of n in which the maximal part is 3.
 * @author Sean A. Irvine
 */
public class A000100 extends LinearRecurrence {

  /** Construct the sequence. */
  public A000100() {
    super(new long[] {-1, -2, -1, 1, 2}, new long[] {0, 0, 0, 1, 2});
  }
}

