package irvine.oeis.a217;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A217527 a(n) = 2^(n-2)*(n-2)^2+2^(n-1).
 * @author Sean A. Irvine
 */
public class A217527 extends LinearRecurrence {

  /** Construct the sequence. */
  public A217527() {
    super(new long[] {8, -12, 6}, new long[] {2, 6, 24});
  }
}
