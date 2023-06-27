package irvine.oeis.a173;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A173712 Numbers n such that (n+n+1) divides the decimal concatenation [n, n+1].
 * @author Sean A. Irvine
 */
public class A173712 extends LinearRecurrence {

  /** Construct the sequence. */
  public A173712() {
    super(1, new long[] {-10, 0, 11, 0}, new long[] {1, 4, 16, 49});
  }
}
