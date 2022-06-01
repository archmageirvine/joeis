package irvine.oeis.a277;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A277980 a(n) = 12*n^2 + 18*n.
 * @author Sean A. Irvine
 */
public class A277980 extends LinearRecurrence {

  /** Construct the sequence. */
  public A277980() {
    super(new long[] {1, -3, 3}, new long[] {0, 30, 84});
  }
}
