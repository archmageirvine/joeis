package irvine.oeis.a137;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A137402 a(n) = Sum_{k=0..n} binomial(floor(n-2k/3), k).
 * @author Sean A. Irvine
 */
public class A137402 extends LinearRecurrence {

  /** Construct the sequence. */
  public A137402() {
    super(new long[] {1, 0, 1, -3, 3}, new long[] {1, 1, 2, 3, 5});
  }
}
