package irvine.oeis.a146;

import irvine.oeis.LinearRecurrence;

/**
 * A146311 <code>a(n) =</code> cos(2*n*arcsin(sqrt(3)) = (-1)^n*cosh(2*n*arcsinh(sqrt(2)).
 * @author Sean A. Irvine
 */
public class A146311 extends LinearRecurrence {

  /** Construct the sequence. */
  public A146311() {
    super(new long[] {-1, -10}, new long[] {1, -5});
  }
}
