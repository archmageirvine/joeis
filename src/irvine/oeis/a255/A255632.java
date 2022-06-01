package irvine.oeis.a255;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A255632 Number of n-length words on {0,1,2,3,4} avoiding runs of zeros of length 1 (mod 3).
 * @author Sean A. Irvine
 */
public class A255632 extends LinearRecurrence {

  /** Construct the sequence. */
  public A255632() {
    super(new long[] {5, 0, 4}, new long[] {1, 4, 17});
  }
}
