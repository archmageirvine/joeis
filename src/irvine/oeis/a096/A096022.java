package irvine.oeis.a096;

import irvine.oeis.LinearRecurrence;

/**
 * A096022.
 * @author Sean A. Irvine
 */
public class A096022 extends LinearRecurrence {

  /** Construct the sequence. */
  public A096022() {
    super(new long[] {-1, 1, 0, 0, 1}, new long[] {15, 27, 39, 51, 75});
  }
}
