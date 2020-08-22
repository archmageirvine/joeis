package irvine.oeis.a138;

import irvine.oeis.LinearRecurrence;

/**
 * A138230 Expansion of (1-x)/(1 - 2*x + 4*x^2).
 * @author Sean A. Irvine
 */
public class A138230 extends LinearRecurrence {

  /** Construct the sequence. */
  public A138230() {
    super(new long[] {-4, 2}, new long[] {1, 1});
  }
}
