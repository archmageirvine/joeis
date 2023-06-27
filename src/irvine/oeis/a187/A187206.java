package irvine.oeis.a187;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A187206 a(n) = 6*(24*n - 1).
 * @author Sean A. Irvine
 */
public class A187206 extends LinearRecurrence {

  /** Construct the sequence. */
  public A187206() {
    super(1, new long[] {-1, 2}, new long[] {138, 282});
  }
}
