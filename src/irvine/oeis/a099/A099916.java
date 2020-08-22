package irvine.oeis.a099;

import irvine.oeis.LinearRecurrence;

/**
 * A099916 Expansion of (1+x^2)^2/(1-x^3+x^6).
 * @author Sean A. Irvine
 */
public class A099916 extends LinearRecurrence {

  /** Construct the sequence. */
  public A099916() {
    super(new long[] {-1, 0, 0, 1, 0, 0}, new long[] {1, 0, 2, 1, 1, 2});
  }
}
