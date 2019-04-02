package irvine.oeis.a238;

import irvine.oeis.LinearRecurrence;

/**
 * A238379 Expansion of (1 - x)/(1 - 36*x + x^2).
 * @author Sean A. Irvine
 */
public class A238379 extends LinearRecurrence {

  /** Construct the sequence. */
  public A238379() {
    super(new long[] {-1, 36}, new long[] {1, 35});
  }
}
