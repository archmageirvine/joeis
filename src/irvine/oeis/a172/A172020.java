package irvine.oeis.a172;

import irvine.oeis.LinearRecurrence;

/**
 * A172020.
 * @author Sean A. Irvine
 */
public class A172020 extends LinearRecurrence {

  /** Construct the sequence. */
  public A172020() {
    super(new long[] {-1, 1, 0, -1, 3, -1, -1, 0, 2}, new long[] {1, 1, 2, 4, 8, 16, 28, 49, 84});
  }
}
