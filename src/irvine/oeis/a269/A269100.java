package irvine.oeis.a269;

import irvine.oeis.LinearRecurrence;

/**
 * A269100 a(n) = 13*n + 11.
 * @author Sean A. Irvine
 */
public class A269100 extends LinearRecurrence {

  /** Construct the sequence. */
  public A269100() {
    super(new long[] {-1, 2}, new long[] {11, 24});
  }
}
