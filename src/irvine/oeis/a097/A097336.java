package irvine.oeis.a097;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A097336 Sum k=0..n, C(n-k, floor(k/2))4^k.
 * @author Sean A. Irvine
 */
public class A097336 extends LinearRecurrence {

  /** Construct the sequence. */
  public A097336() {
    super(new long[] {16, 0, 1}, new long[] {1, 5, 5});
  }
}
