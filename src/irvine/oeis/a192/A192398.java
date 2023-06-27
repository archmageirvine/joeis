package irvine.oeis.a192;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A192398 a(n) = n^4 + 3*n^3 - 3*n.
 * @author Sean A. Irvine
 */
public class A192398 extends LinearRecurrence {

  /** Construct the sequence. */
  public A192398() {
    super(1, new long[] {1, -5, 10, -10, 5}, new long[] {1, 34, 153, 436, 985});
  }
}
