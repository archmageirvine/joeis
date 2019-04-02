package irvine.oeis.a123;

import irvine.oeis.LinearRecurrence;

/**
 * A123596 Squares alternating with triangular numbers.
 * @author Sean A. Irvine
 */
public class A123596 extends LinearRecurrence {

  /** Construct the sequence. */
  public A123596() {
    super(new long[] {1, 0, -3, 0, 3, 0}, new long[] {0, 0, 1, 1, 4, 3});
  }
}
