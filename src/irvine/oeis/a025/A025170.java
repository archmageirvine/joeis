package irvine.oeis.a025;

import irvine.oeis.LinearRecurrence;

/**
 * A025170 G.f.: 1/(1 + 2*x + 9*x^2).
 * @author Sean A. Irvine
 */
public class A025170 extends LinearRecurrence {

  /** Construct the sequence. */
  public A025170() {
    super(new long[] {-9, -2}, new long[] {1, -2});
  }
}
