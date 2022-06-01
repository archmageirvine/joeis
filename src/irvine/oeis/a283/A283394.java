package irvine.oeis.a283;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A283394 a(n) = 3*n*(3*n + 7)/2 + 4.
 * @author Sean A. Irvine
 */
public class A283394 extends LinearRecurrence {

  /** Construct the sequence. */
  public A283394() {
    super(new long[] {1, -3, 3}, new long[] {4, 19, 43});
  }
}
