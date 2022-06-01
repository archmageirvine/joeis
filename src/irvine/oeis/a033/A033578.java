package irvine.oeis.a033;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A033578 a(n) = (3*n - 1)*(4*n - 1).
 * @author Sean A. Irvine
 */
public class A033578 extends LinearRecurrence {

  /** Construct the sequence. */
  public A033578() {
    super(new long[] {1, -3, 3}, new long[] {1, 6, 35});
  }
}
