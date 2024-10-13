package irvine.oeis.a173;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A173764 a(n) = (10^n+17)/3.
 * @author Sean A. Irvine
 */
public class A173764 extends LinearRecurrence {

  /** Construct the sequence. */
  public A173764() {
    super(1, new long[] {-10, 11}, new long[] {9, 39});
  }
}
