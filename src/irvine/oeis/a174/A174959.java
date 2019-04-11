package irvine.oeis.a174;

import irvine.oeis.LinearRecurrence;

/**
 * A174959 G.f.: <code>x^3*(2*x-1)/[(1-x)*(1-x-x^2)*(1-2*x^2)]</code>.
 * @author Sean A. Irvine
 */
public class A174959 extends LinearRecurrence {

  /** Construct the sequence. */
  public A174959() {
    super(new long[] {2, 0, -5, 2, 2}, new long[] {0, 0, 0, -1, 0});
  }
}
