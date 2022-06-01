package irvine.oeis.a277;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A277985 a(n) = 3*(9*n - 1)*(3*n - 2).
 * @author Sean A. Irvine
 */
public class A277985 extends LinearRecurrence {

  /** Construct the sequence. */
  public A277985() {
    super(new long[] {1, -3, 3}, new long[] {6, 24, 204});
  }
}
