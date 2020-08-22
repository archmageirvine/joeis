package irvine.oeis.a089;

import irvine.oeis.LinearRecurrence;

/**
 * A089932 G.f.: (1-x)^5/((-1+4*x-3*x^2+x^3)*(1-3*x+x^2)*(-1+2*x)).
 * @author Sean A. Irvine
 */
public class A089932 extends LinearRecurrence {

  /** Construct the sequence. */
  public A089932() {
    super(new long[] {-2, 13, -34, 46, -30, 9}, new long[] {1, 4, 16, 60, 215, 747});
  }
}
