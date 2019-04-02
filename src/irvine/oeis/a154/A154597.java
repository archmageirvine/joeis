package irvine.oeis.a154;

import irvine.oeis.LinearRecurrence;

/**
 * A154597 a(n) = 15*a(n-1) + a(n-2) with a(0) = 0, a(1) = 1.
 * @author Sean A. Irvine
 */
public class A154597 extends LinearRecurrence {

  /** Construct the sequence. */
  public A154597() {
    super(new long[] {1, 15}, new long[] {0, 1});
  }
}
