package irvine.oeis.a270;

import irvine.oeis.LinearRecurrence;

/**
 * A270872.
 * @author Sean A. Irvine
 */
public class A270872 extends LinearRecurrence {

  /** Construct the sequence. */
  public A270872() {
    super(new long[] {1, -9, 36, -84, 126, -126, 84, -36, 9}, new long[] {13, 2278, 19439, 117910, 550009, 2072078, 6584443, 18269614, 45445445});
  }
}
