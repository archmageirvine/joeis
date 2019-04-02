package irvine.oeis.a078;

import irvine.oeis.LinearRecurrence;

/**
 * A078046 Expansion of (1-x)/(1 + x + x^2 - x^3).
 * @author Sean A. Irvine
 */
public class A078046 extends LinearRecurrence {

  /** Construct the sequence. */
  public A078046() {
    super(new long[] {1, -1, -1}, new long[] {1, -2, 1});
  }
}
