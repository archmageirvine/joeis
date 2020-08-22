package irvine.oeis.a099;

import irvine.oeis.LinearRecurrence;

/**
 * A099371 Expansion of g.f.: x/(1 - 9*x - x^2).
 * @author Sean A. Irvine
 */
public class A099371 extends LinearRecurrence {

  /** Construct the sequence. */
  public A099371() {
    super(new long[] {1, 9}, new long[] {0, 1});
  }
}
