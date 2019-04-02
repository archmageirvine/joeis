package irvine.oeis.a123;

import irvine.oeis.LinearRecurrence;

/**
 * A123950 G.f.: x^2*(1-2*x) / (1-3*x-3*x^2+2*x^3).
 * @author Sean A. Irvine
 */
public class A123950 extends LinearRecurrence {

  /** Construct the sequence. */
  public A123950() {
    super(new long[] {-2, 3, 3}, new long[] {0, 1, 1});
  }
}
