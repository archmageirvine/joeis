package irvine.oeis.a062;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A062397 a(n) = 10^n + 1.
 * @author Sean A. Irvine
 */
public class A062397 extends LinearRecurrence {

  /** Construct the sequence. */
  public A062397() {
    super(new long[] {-10, 11}, new long[] {2, 11});
  }
}
