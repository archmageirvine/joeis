package irvine.oeis.a246;

import irvine.oeis.LinearRecurrence;

/**
 * A246313 G.f.: (-1+6*x)/(1-3*x-2*x^2).
 * @author Sean A. Irvine
 */
public class A246313 extends LinearRecurrence {

  /** Construct the sequence. */
  public A246313() {
    super(new long[] {2, 3}, new long[] {-1, 3});
  }
}
