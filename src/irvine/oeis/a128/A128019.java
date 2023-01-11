package irvine.oeis.a128;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A128019 Expansion of (1 - 3x)/(1 + 3*x^2).
 * @author Sean A. Irvine
 */
public class A128019 extends LinearRecurrence {

  /** Construct the sequence. */
  public A128019() {
    super(new long[] {-3, 0}, new long[] {1, -3});
  }
}
