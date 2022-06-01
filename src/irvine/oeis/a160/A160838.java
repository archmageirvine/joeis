package irvine.oeis.a160;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A160838 G.f.: (1+38*x+263*x^2+484*x^3+263*x^4+38*x^5+x^6)/(1-x)^7.
 * @author Sean A. Irvine
 */
public class A160838 extends LinearRecurrence {

  /** Construct the sequence. */
  public A160838() {
    super(new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {1, 45, 557, 3473, 14417, 45965, 121997});
  }
}
