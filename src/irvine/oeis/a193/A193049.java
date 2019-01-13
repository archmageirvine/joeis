package irvine.oeis.a193;

import irvine.oeis.LinearRecurrence;

/**
 * A193049.
 * @author Sean A. Irvine
 */
public class A193049 extends LinearRecurrence {

  /** Construct the sequence. */
  public A193049() {
    super(new long[] {1, -5, 8, 1, -20, 29, -20, 7}, new long[] {0, 1, 1, 2, 4, 12, 37, 105});
  }
}
