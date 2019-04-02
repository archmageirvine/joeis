package irvine.oeis.a078;

import irvine.oeis.LinearRecurrence;

/**
 * A078070 Expansion of (1-x)/(1 + 2*x + 2*x^2 + x^3).
 * @author Sean A. Irvine
 */
public class A078070 extends LinearRecurrence {

  /** Construct the sequence. */
  public A078070() {
    super(new long[] {-1, -2, -2}, new long[] {1, -3, 4});
  }
}
