package irvine.oeis.a277;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A277987 a(n) = 100*n - 28.
 * @author Sean A. Irvine
 */
public class A277987 extends LinearRecurrence {

  /** Construct the sequence. */
  public A277987() {
    super(new long[] {-1, 2}, new long[] {-28, 72});
  }
}
