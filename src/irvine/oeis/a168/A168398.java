package irvine.oeis.a168;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A168398 a(n) = 4 + 8*floor((n-1)/2).
 * @author Sean A. Irvine
 */
public class A168398 extends LinearRecurrence {

  /** Construct the sequence. */
  public A168398() {
    super(1, new long[] {-1, 1, 1}, new long[] {4, 4, 12});
  }
}
