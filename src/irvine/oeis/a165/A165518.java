package irvine.oeis.a165;

import irvine.oeis.LinearRecurrence;

/**
 * A165518 Perfect squares (A000290) that can be expressed as the sum of four consecutive triangular numbers (A000217).
 * @author Sean A. Irvine
 */
public class A165518 extends LinearRecurrence {

  /** Construct the sequence. */
  public A165518() {
    super(new long[] {1, -35, 35}, new long[] {4, 100, 3364});
  }
}
