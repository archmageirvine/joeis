package irvine.oeis.a021;

import irvine.oeis.LinearRecurrence;

/**
 * A021994.
 * @author Sean A. Irvine
 */
public class A021994 extends LinearRecurrence {

  /** Construct the sequence. */
  public A021994() {
    super(new long[] {-480, 688, -234, 27}, new long[] {1, 27, 495, 7735});
  }
}
