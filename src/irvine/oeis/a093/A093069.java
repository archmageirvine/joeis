package irvine.oeis.a093;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A093069 a(n) = (2^n + 1)^2 - 2.
 * @author Sean A. Irvine
 */
public class A093069 extends LinearRecurrence {

  /** Construct the sequence. */
  public A093069() {
    super(1, new long[] {8, -14, 7}, new long[] {7, 23, 79});
  }
}
