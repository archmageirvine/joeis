package irvine.oeis.a255;

import irvine.oeis.LinearRecurrence;

/**
 * A255631 Number of n-length words on {0,1,2,3} avoiding runs of zeros of length 1 (mod 3).
 * @author Sean A. Irvine
 */
public class A255631 extends LinearRecurrence {

  /** Construct the sequence. */
  public A255631() {
    super(new long[] {4, 0, 3}, new long[] {1, 3, 10});
  }
}
