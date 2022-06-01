package irvine.oeis.a152;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A152949 a(n) = 3 + binomial(n-1,2).
 * @author Sean A. Irvine
 */
public class A152949 extends LinearRecurrence {

  /** Construct the sequence. */
  public A152949() {
    super(new long[] {1, -3, 3}, new long[] {3, 3, 4});
  }
}
