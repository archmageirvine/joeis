package irvine.oeis.a088;

import irvine.oeis.LinearRecurrence;

/**
 * A088316 a(n) = 13*a(n-1) + a(n-2), starting with a(0) = 2 and a(1) = 13.
 * @author Sean A. Irvine
 */
public class A088316 extends LinearRecurrence {

  /** Construct the sequence. */
  public A088316() {
    super(new long[] {1, 13}, new long[] {2, 13});
  }
}
