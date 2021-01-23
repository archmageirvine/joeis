package irvine.oeis.a255;

import irvine.oeis.LinearRecurrence;

/**
 * A255116 Number of n-length words on {0,1,2,3} in which 0 appears only in runs of length 2.
 * @author Sean A. Irvine
 */
public class A255116 extends LinearRecurrence {

  /** Construct the sequence. */
  public A255116() {
    super(new long[] {3, 0, 3}, new long[] {1, 3, 10});
  }
}
