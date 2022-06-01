package irvine.oeis.a017;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A017091 a(n) = (8*n + 2)^3.
 * @author Sean A. Irvine
 */
public class A017091 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017091() {
    super(new long[] {-1, 4, -6, 4}, new long[] {8, 1000, 5832, 17576});
  }
}
