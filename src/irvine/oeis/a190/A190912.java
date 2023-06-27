package irvine.oeis.a190;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A190912 Partial sums of pentanacci numbers (A000322).
 * @author Sean A. Irvine
 */
public class A190912 extends LinearRecurrence {

  /** Construct the sequence. */
  public A190912() {
    super(1, new long[] {-1, 0, 0, 0, 0, 2}, new long[] {1, 2, 3, 4, 5, 10});
  }
}
