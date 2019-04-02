package irvine.oeis.a078;

import irvine.oeis.LinearRecurrence;

/**
 * A078010 Expansion of (1-x)/(1-x-x^2-2*x^3).
 * @author Sean A. Irvine
 */
public class A078010 extends LinearRecurrence {

  /** Construct the sequence. */
  public A078010() {
    super(new long[] {2, 1, 1}, new long[] {1, 0, 1});
  }
}
