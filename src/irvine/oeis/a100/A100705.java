package irvine.oeis.a100;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A100705 a(n) = n^3 + (n+1)^2.
 * @author Sean A. Irvine
 */
public class A100705 extends LinearRecurrence {

  /** Construct the sequence. */
  public A100705() {
    super(new long[] {-1, 4, -6, 4}, new long[] {1, 5, 17, 43});
  }
}
