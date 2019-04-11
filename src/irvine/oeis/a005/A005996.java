package irvine.oeis.a005;

import irvine.oeis.LinearRecurrence;

/**
 * A005996 G.f.: <code>2(1-x^3)/((1-x)^5*(1+x)^2)</code>.
 * @author Sean A. Irvine
 */
public class A005996 extends LinearRecurrence {

  /** Construct the sequence. */
  public A005996() {
    super(new long[] {-1, 2, 1, -4, 1, 2}, new long[] {2, 6, 16, 30, 54, 84});
  }
}

