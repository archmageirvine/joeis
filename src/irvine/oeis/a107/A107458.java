package irvine.oeis.a107;

import irvine.oeis.LinearRecurrence;

/**
 * A107458 G.f.: (1-x^2-x^3)/( (1+x)(1-x-x^3) ).
 * @author Sean A. Irvine
 */
public class A107458 extends LinearRecurrence {

  /** Construct the sequence. */
  public A107458() {
    super(new long[] {1, 1, 1, 0}, new long[] {1, 0, 0, 0});
  }
}
