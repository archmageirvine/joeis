package irvine.oeis.a099;

import irvine.oeis.LinearRecurrence;

/**
 * A099462 Expansion of x/(1-4x^2-4x^3).
 * @author Sean A. Irvine
 */
public class A099462 extends LinearRecurrence {

  /** Construct the sequence. */
  public A099462() {
    super(new long[] {4, 4, 0}, new long[] {0, 1, 0});
  }
}
