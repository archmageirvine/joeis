package irvine.oeis.a061;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A061349 Sum of antidiagonals of A060736.
 * @author Sean A. Irvine
 */
public class A061349 extends LinearRecurrence {

  /** Construct the sequence. */
  public A061349() {
    super(new long[] {-1, 2, 1, -4, 1, 2}, new long[] {0, 1, 6, 17, 40, 75});
  }
}
