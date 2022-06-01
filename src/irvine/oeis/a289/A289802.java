package irvine.oeis.a289;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A289802 p-INVERT of the quarter-squares (A002620), where p(S) = 1 - S - S^2.
 * @author Sean A. Irvine
 */
public class A289802 extends LinearRecurrence {

  /** Construct the sequence. */
  public A289802() {
    super(new long[] {-1, 4, -4, -5, 12, -4, -5, 5}, new long[] {1, 4, 15, 53, 185, 643, 2234, 7764});
  }
}
