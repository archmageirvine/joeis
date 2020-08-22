package irvine.oeis.a271;

import irvine.oeis.LinearRecurrence;

/**
 * A271972 Expansion of (1 + 3*x)/(1 - 4*x + 7*x^2).
 * @author Sean A. Irvine
 */
public class A271972 extends LinearRecurrence {

  /** Construct the sequence. */
  public A271972() {
    super(new long[] {-7, 4}, new long[] {1, 7});
  }
}
