package irvine.oeis.a094;

import irvine.oeis.LinearRecurrence;

/**
 * A094195 G.f.: (1-4*x)/((1-5*x)*(1-x)^2).
 * @author Sean A. Irvine
 */
public class A094195 extends LinearRecurrence {

  /** Construct the sequence. */
  public A094195() {
    super(new long[] {5, -11, 7}, new long[] {1, 3, 10});
  }
}
