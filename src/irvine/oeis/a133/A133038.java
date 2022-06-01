package irvine.oeis.a133;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A133038 Cubes of A000931.
 * @author Sean A. Irvine
 */
public class A133038 extends LinearRecurrence {

  /** Construct the sequence. */
  public A133038() {
    super(new long[] {-1, 0, -1, -1, -4, 4, -2, 3, 2, 1}, new long[] {1, 0, 0, 1, 0, 1, 1, 1, 8, 8});
  }
}
