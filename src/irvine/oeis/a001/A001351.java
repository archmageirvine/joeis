package irvine.oeis.a001;

import irvine.oeis.LinearRecurrence;

/**
 * A001351 Associated Mersenne numbers.
 * @author Sean A. Irvine
 */
public class A001351 extends LinearRecurrence {

  /**
   * Construct the sequence.
   */
  public A001351() {
    super(new long[] {-1, 1, -1, 3, -1, 1}, new long[] {0, 1, 3, 1, 3, 11});
  }
}
