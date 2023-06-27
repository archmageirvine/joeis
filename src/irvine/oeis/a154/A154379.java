package irvine.oeis.a154;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A154379 a(n) = 250*n + 10.
 * @author Sean A. Irvine
 */
public class A154379 extends LinearRecurrence {

  /** Construct the sequence. */
  public A154379() {
    super(1, new long[] {-1, 2}, new long[] {260, 510});
  }
}
