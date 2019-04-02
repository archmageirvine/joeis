package irvine.oeis.a113;

import irvine.oeis.LinearRecurrence;

/**
 * A113312 Expansion of (1+x)^2/(1-2x^2+x^3).
 * @author Sean A. Irvine
 */
public class A113312 extends LinearRecurrence {

  /** Construct the sequence. */
  public A113312() {
    super(new long[] {-1, 2, 0}, new long[] {1, 2, 3});
  }
}
