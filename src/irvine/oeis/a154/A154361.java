package irvine.oeis.a154;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A154361 a(n) = 250*n - 70.
 * @author Sean A. Irvine
 */
public class A154361 extends LinearRecurrence {

  /** Construct the sequence. */
  public A154361() {
    super(new long[] {-1, 2}, new long[] {-70, 180});
  }
}
