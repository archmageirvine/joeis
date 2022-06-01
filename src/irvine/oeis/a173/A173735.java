package irvine.oeis.a173;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A173735 a(n) = (10^n + 26)/9.
 * @author Sean A. Irvine
 */
public class A173735 extends LinearRecurrence {

  /** Construct the sequence. */
  public A173735() {
    super(new long[] {-10, 11}, new long[] {3, 4});
  }
}
