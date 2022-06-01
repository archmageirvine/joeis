package irvine.oeis.a094;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A094014 Expansion of (1-2*x)/(1-8*x^2).
 * @author Sean A. Irvine
 */
public class A094014 extends LinearRecurrence {

  /** Construct the sequence. */
  public A094014() {
    super(new long[] {8, 0}, new long[] {1, -2});
  }
}
