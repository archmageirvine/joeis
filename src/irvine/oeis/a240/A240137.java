package irvine.oeis.a240;

import irvine.oeis.LinearRecurrence;

/**
 * A240137 Sum of n consecutive cubes starting from n^3.
 * @author Sean A. Irvine
 */
public class A240137 extends LinearRecurrence {

  /** Construct the sequence. */
  public A240137() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {0, 1, 35, 216, 748});
  }
}
