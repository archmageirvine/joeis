package irvine.oeis.a217;

import irvine.oeis.LinearRecurrence;

/**
 * A217893.
 * @author Sean A. Irvine
 */
public class A217893 extends LinearRecurrence {

  /** Construct the sequence. */
  public A217893() {
    super(new long[] {1, -2, 0, 2}, new long[] {-17, 13, -7, 73});
  }
}
