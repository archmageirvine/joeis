package irvine.oeis.a033;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A033550 a(n) = A005248(n) - n.
 * @author Sean A. Irvine
 */
public class A033550 extends LinearRecurrence {

  /** Construct the sequence. */
  public A033550() {
    super(new long[] {-1, 5, -8, 5}, new long[] {2, 2, 5, 15});
  }
}
