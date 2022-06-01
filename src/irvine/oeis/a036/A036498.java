package irvine.oeis.a036;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A036498 Numbers of the form m*(6*m-1) and m*(6*m+1), where m is an integer.
 * @author Sean A. Irvine
 */
public class A036498 extends LinearRecurrence {

  /** Construct the sequence. */
  public A036498() {
    super(new long[] {1, -1, -2, 2, 1}, new long[] {0, 5, 7, 22, 26});
  }
}
