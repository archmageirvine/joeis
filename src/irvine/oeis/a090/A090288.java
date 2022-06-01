package irvine.oeis.a090;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A090288 a(n) = 2*n^2 + 6*n + 2.
 * @author Sean A. Irvine
 */
public class A090288 extends LinearRecurrence {

  /** Construct the sequence. */
  public A090288() {
    super(new long[] {1, -3, 3}, new long[] {2, 10, 22});
  }
}
