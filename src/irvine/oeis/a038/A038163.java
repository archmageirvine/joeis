package irvine.oeis.a038;

import irvine.oeis.LinearRecurrence;

/**
 * A038163 G.f.: 1/((1-x)*(1-x^2))^3.
 * @author Sean A. Irvine
 */
public class A038163 extends LinearRecurrence {

  /** Construct the sequence. */
  public A038163() {
    super(new long[] {-1, 3, 0, -8, 6, 6, -8, 0, 3}, new long[] {1, 3, 9, 19, 39, 69, 119, 189, 294});
  }
}
