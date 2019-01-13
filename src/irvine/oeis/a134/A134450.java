package irvine.oeis.a134;

import irvine.oeis.LinearRecurrence;

/**
 * A134450.
 * @author Sean A. Irvine
 */
public class A134450 extends LinearRecurrence {

  /** Construct the sequence. */
  public A134450() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {43175, 1382000, 10495575, 44230400, 134984375, 335890800});
  }
}
