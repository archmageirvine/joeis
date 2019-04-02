package irvine.oeis.a203;

import irvine.oeis.LinearRecurrence;

/**
 * A203574 Bisection of A099924 (Lucas convolution); one half of the members with odd arguments.
 * @author Sean A. Irvine
 */
public class A203574 extends LinearRecurrence {

  /** Construct the sequence. */
  public A203574() {
    super(new long[] {-1, 6, -11, 6}, new long[] {2, 11, 41, 137});
  }
}
