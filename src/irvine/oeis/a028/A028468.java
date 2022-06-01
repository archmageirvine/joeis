package irvine.oeis.a028;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A028468 Number of perfect matchings in graph P_{6} X P_{n}.
 * @author Sean A. Irvine
 */
public class A028468 extends LinearRecurrence {

  /** Construct the sequence. */
  public A028468() {
    super(new long[] {-1, -1, 20, -10, -38, 10, 20, 1}, new long[] {1, 1, 13, 41, 281, 1183, 6728, 31529});
  }
}
