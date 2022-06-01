package irvine.oeis.a070;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A070378 a(n) = 5^n mod 28.
 * @author Sean A. Irvine
 */
public class A070378 extends LinearRecurrence {

  /** Construct the sequence. */
  public A070378() {
    super(new long[] {1, -1, 1, -1, 1}, new long[] {1, 5, 25, 13, 9});
  }
}
