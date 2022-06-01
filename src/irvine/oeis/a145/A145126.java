package irvine.oeis.a145;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A145126 a(n) = 1 + (6 + (11 + (6 + n)*n)*n)*n/24.
 * @author Sean A. Irvine
 */
public class A145126 extends LinearRecurrence {

  /** Construct the sequence. */
  public A145126() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {1, 2, 6, 16, 36});
  }
}
