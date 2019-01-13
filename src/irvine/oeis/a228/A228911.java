package irvine.oeis.a228;

import irvine.oeis.LinearRecurrence;

/**
 * A228911.
 * @author Sean A. Irvine
 */
public class A228911 extends LinearRecurrence {

  /** Construct the sequence. */
  public A228911() {
    super(new long[] {362880, -1026576, 1172700, -723680, 269325, -63273, 9450, -870, 45}, new long[] {0, 0, 0, 0, 0, 0, 0, 0, 40320});
  }
}
