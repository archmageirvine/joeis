package irvine.oeis.a099;

import irvine.oeis.LinearRecurrence;

/**
 * A099493 Expansion of (1+x^2)^2/(1+x^2-2x^3+x^4+x^6).
 * @author Sean A. Irvine
 */
public class A099493 extends LinearRecurrence {

  /** Construct the sequence. */
  public A099493() {
    super(new long[] {-1, 0, -1, 2, -1, 0}, new long[] {1, 0, 1, 2, -1, 0});
  }
}
