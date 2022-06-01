package irvine.oeis.a133;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A133301 a(n) is the n-th pentagonal number which is the sum of two consecutive pentagonal numbers.
 * @author Sean A. Irvine
 */
public class A133301 extends LinearRecurrence {

  /** Construct the sequence. */
  public A133301() {
    super(new long[] {1, -1, -1331714, 1331714, 1}, new long[] {1, 1926, 850137, 2564464982L, 1132138928657L});
  }
}
