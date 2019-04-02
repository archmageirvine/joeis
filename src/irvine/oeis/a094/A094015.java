package irvine.oeis.a094;

import irvine.oeis.LinearRecurrence;

/**
 * A094015 Expansion of (1+4x)/(1-8x^2).
 * @author Sean A. Irvine
 */
public class A094015 extends LinearRecurrence {

  /** Construct the sequence. */
  public A094015() {
    super(new long[] {8, 0}, new long[] {1, 4});
  }
}
