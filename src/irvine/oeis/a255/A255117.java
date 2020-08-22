package irvine.oeis.a255;

import irvine.oeis.LinearRecurrence;

/**
 * A255117 Number of n-length words on {0,1,2,3,4} in which 0 appears only in runs of length 2.
 * @author Sean A. Irvine
 */
public class A255117 extends LinearRecurrence {

  /** Construct the sequence. */
  public A255117() {
    super(new long[] {4, 0, 4}, new long[] {1, 4, 17});
  }
}
