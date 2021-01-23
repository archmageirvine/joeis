package irvine.oeis.a257;

import irvine.oeis.LinearRecurrence;

/**
 * A257352 G.f.: (1-2*x+51*x^2)/(1-x)^3.
 * @author Sean A. Irvine
 */
public class A257352 extends LinearRecurrence {

  /** Construct the sequence. */
  public A257352() {
    super(new long[] {1, -3, 3}, new long[] {1, 1, 51});
  }
}
