package irvine.oeis.a020;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A020956 a(n) = Sum_{k&gt;=1} floor(tau^(n-k)) where tau is A001622.
 * @author Sean A. Irvine
 */
public class A020956 extends LinearRecurrence {

  /** Construct the sequence. */
  public A020956() {
    super(1, new long[] {1, 0, -3, 1, 2}, new long[] {1, 2, 4, 8, 14});
  }
}
