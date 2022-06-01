package irvine.oeis.a165;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A165130 a(n) = (2^(n+4)-1)*(2^n-1).
 * @author Sean A. Irvine
 */
public class A165130 extends LinearRecurrence {

  /** Construct the sequence. */
  public A165130() {
    super(new long[] {8, -14, 7}, new long[] {0, 31, 189});
  }
}
