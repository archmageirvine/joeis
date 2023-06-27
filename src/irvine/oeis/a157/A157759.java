package irvine.oeis.a157;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A157759 a(n) = 15780962*n^2 - 25943924*n + 10662963.
 * @author Sean A. Irvine
 */
public class A157759 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157759() {
    super(1, new long[] {1, -3, 3}, new long[] {500001, 21898963, 74859849});
  }
}
