package irvine.oeis.a094;

import irvine.oeis.LinearRecurrence;

/**
 * A094364 Expansion of (1-5x)/(1-10x-100x^2).
 * @author Sean A. Irvine
 */
public class A094364 extends LinearRecurrence {

  /** Construct the sequence. */
  public A094364() {
    super(new long[] {100, 10}, new long[] {1, 5});
  }
}
