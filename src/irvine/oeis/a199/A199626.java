package irvine.oeis.a199;

import irvine.oeis.LinearRecurrence;

/**
 * A199626 G.f.: (1+x)^(2*g)*(1+x^3)^(3*g)/((1-x^2)*(1-x^4))-x^(2*g)*(1+x)^4/((1-x^2)*(1-x^4)) for g=0.
 * @author Sean A. Irvine
 */
public class A199626 extends LinearRecurrence {

  /** Construct the sequence. */
  public A199626() {
    super(new long[] {-1, 0, 1, 0, 1, 0}, new long[] {0, -4, -6, -8, -7, -12});
  }
}
