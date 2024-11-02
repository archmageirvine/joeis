package irvine.oeis.a134;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A134704 Expansion of g.f. -x*(10*x^4+12*x^3-x^2-3*x-3)/((x^2+x-1)*(4*x^3+x^2-x-1)).
 * @author Sean A. Irvine
 */
public class A134704 extends LinearRecurrence {

  /** Construct the sequence. */
  public A134704() {
    super(1, new long[] {-4, -5, 4, 3, 0}, new long[] {3, 3, 10, 9, 17});
  }
}
