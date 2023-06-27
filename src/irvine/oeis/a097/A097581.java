package irvine.oeis.a097;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A097581 a(n) = 3*2^floor((n-1)/2) + (-1)^n.
 * @author Sean A. Irvine
 */
public class A097581 extends LinearRecurrence {

  /** Construct the sequence. */
  public A097581() {
    super(1, new long[] {2, 2, -1}, new long[] {2, 4, 5});
  }
}
