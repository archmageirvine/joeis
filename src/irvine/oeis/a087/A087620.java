package irvine.oeis.a087;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A087620 #{0&lt;=k&lt;=n: k*n is divisible by 4}.
 * @author Sean A. Irvine
 */
public class A087620 extends LinearRecurrence {

  /** Construct the sequence. */
  public A087620() {
    super(new long[] {-1, 0, 0, 0, 2, 0, 0, 0}, new long[] {1, 1, 2, 1, 5, 2, 4, 2});
  }
}
