package irvine.oeis.a043;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A043547 Odd numbers interspersed with double the previous odd number.
 * @author Sean A. Irvine
 */
public class A043547 extends LinearRecurrence {

  /** Construct the sequence. */
  public A043547() {
    super(new long[] {-1, 0, 2, 0}, new long[] {1, 2, 3, 6});
  }
}
