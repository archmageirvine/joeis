package irvine.oeis.a270;

import irvine.oeis.LinearRecurrence;

/**
 * A270272 a(n) = binomial(n+3,n)^3.
 * @author Sean A. Irvine
 */
public class A270272 extends LinearRecurrence {

  /** Construct the sequence. */
  public A270272() {
    super(new long[] {-1, 10, -45, 120, -210, 252, -210, 120, -45, 10}, new long[] {1, 64, 1000, 8000, 42875, 175616, 592704, 1728000, 4492125, 10648000});
  }
}
