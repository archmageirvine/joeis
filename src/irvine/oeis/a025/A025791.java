package irvine.oeis.a025;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A025791 Expansion of 1/((1-x)(1-x^9)(1-x^10)).
 * @author Sean A. Irvine
 */
public class A025791 extends LinearRecurrence {

  /** Construct the sequence. */
  public A025791() {
    super(new long[] {1, -1, 0, 0, 0, 0, 0, 0, 0, -1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 1}, new long[] {1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 3, 3, 3, 3, 3, 3, 3, 3, 4, 5});
  }
}
