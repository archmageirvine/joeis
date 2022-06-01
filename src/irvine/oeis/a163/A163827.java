package irvine.oeis.a163;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A163827 a(n) = 6n^3 + 1, solution z in Diophantine equation x^3 + y^3 = z^3 - 2. It may be considered a Fermat near miss by 2.
 * @author Sean A. Irvine
 */
public class A163827 extends LinearRecurrence {

  /** Construct the sequence. */
  public A163827() {
    super(new long[] {-1, 4, -6, 4}, new long[] {7, 49, 163, 385});
  }
}
