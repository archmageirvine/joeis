package irvine.oeis.a094;

import irvine.oeis.LinearRecurrence;

/**
 * A094013 Expansion of (1-4*x)/(1-4*x-4*x^2).
 * @author Sean A. Irvine
 */
public class A094013 extends LinearRecurrence {

  /** Construct the sequence. */
  public A094013() {
    super(new long[] {4, 4}, new long[] {1, 0});
  }
}
