package irvine.oeis.a082;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A082587 G.f.: (3+x+x^2+2*x^3)/(1-x^2-x^4).
 * @author Sean A. Irvine
 */
public class A082587 extends LinearRecurrence {

  /** Construct the sequence. */
  public A082587() {
    super(new long[] {1, 0, 1, 0}, new long[] {3, 1, 4, 3});
  }
}
