package irvine.oeis.a128;

import irvine.oeis.LinearRecurrence;

/**
 * A128018 Expansion of (1-4*x)/(1-2*x+4*x^2).
 * @author Sean A. Irvine
 */
public class A128018 extends LinearRecurrence {

  /** Construct the sequence. */
  public A128018() {
    super(new long[] {-4, 2}, new long[] {1, -2});
  }
}
