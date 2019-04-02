package irvine.oeis.a078;

import irvine.oeis.LinearRecurrence;

/**
 * A078020 Expansion of (1-x)/(1-x+2*x^2).
 * @author Sean A. Irvine
 */
public class A078020 extends LinearRecurrence {

  /** Construct the sequence. */
  public A078020() {
    super(new long[] {-2, 1}, new long[] {1, 0});
  }
}
