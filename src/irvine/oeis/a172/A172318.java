package irvine.oeis.a172;

import irvine.oeis.LinearRecurrence;

/**
 * A172318 9th column of the array A172119.
 * @author Sean A. Irvine
 */
public class A172318 extends LinearRecurrence {

  /** Construct the sequence. */
  public A172318() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 0, 0, 2}, new long[] {1, 2, 4, 8, 16, 32, 64, 128, 256});
  }
}
