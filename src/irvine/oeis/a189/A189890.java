package irvine.oeis.a189;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A189890 a(n) = (n^3 - 2*n^2 + 3*n + 2)/2.
 * @author Sean A. Irvine
 */
public class A189890 extends LinearRecurrence {

  /** Construct the sequence. */
  public A189890() {
    super(new long[] {-1, 4, -6, 4}, new long[] {2, 4, 10, 23});
  }
}
