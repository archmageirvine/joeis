package irvine.oeis.a108;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A108404 Expansion of (1-4x)/(1-8x+11x^2).
 * @author Sean A. Irvine
 */
public class A108404 extends LinearRecurrence {

  /** Construct the sequence. */
  public A108404() {
    super(new long[] {-11, 8}, new long[] {1, 4});
  }
}
