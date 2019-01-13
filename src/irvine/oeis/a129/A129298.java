package irvine.oeis.a129;

import irvine.oeis.LinearRecurrence;

/**
 * A129298.
 * @author Sean A. Irvine
 */
public class A129298 extends LinearRecurrence {

  /** Construct the sequence. */
  public A129298() {
    super(new long[] {1, -1, 0, -6, 6, 0, 1}, new long[] {0, 51, 120, 267, 540, 931, 1780});
  }
}
