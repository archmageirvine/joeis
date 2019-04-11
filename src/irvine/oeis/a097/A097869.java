package irvine.oeis.a097;

import irvine.oeis.LinearRecurrence;

/**
 * A097869 G.f.: <code>(1+x^4+x^5+x^9)/((1-x)*(1-x^2)*(1-x^4)^2)</code>.
 * @author Sean A. Irvine
 */
public class A097869 extends LinearRecurrence {

  /** Construct the sequence. */
  public A097869() {
    super(new long[] {-1, 2, -1, 0, 2, -4, 2, 0, -1, 2}, new long[] {1, 1, 2, 2, 6, 7, 11, 12, 21, 25});
  }
}
