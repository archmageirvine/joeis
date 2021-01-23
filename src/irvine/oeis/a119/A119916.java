package irvine.oeis.a119;

import irvine.oeis.LinearRecurrence;

/**
 * A119916 Number of runs of 0's of odd length in all ternary words of length n.
 * @author Sean A. Irvine
 */
public class A119916 extends LinearRecurrence {

  /** Construct the sequence. */
  public A119916() {
    super(new long[] {-9, -3, 5}, new long[] {0, 1, 4});
  }
}
