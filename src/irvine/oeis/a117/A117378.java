package irvine.oeis.a117;

import irvine.oeis.LinearRecurrence;

/**
 * A117378 Expansion of (1-4*x)/(1-x+x^2).
 * @author Sean A. Irvine
 */
public class A117378 extends LinearRecurrence {

  /** Construct the sequence. */
  public A117378() {
    super(new long[] {-1, 1}, new long[] {1, -3});
  }
}
