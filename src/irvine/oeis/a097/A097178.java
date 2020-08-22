package irvine.oeis.a097;

import irvine.oeis.LinearRecurrence;

/**
 * A097178 Expansion of (1+10*x-101*x^2-900*x^3)/((1-100*x^2)*(1-101*x^2)).
 * @author Sean A. Irvine
 */
public class A097178 extends LinearRecurrence {

  /** Construct the sequence. */
  public A097178() {
    super(new long[] {-10100, 0, 201, 0}, new long[] {1, 10, 100, 1110});
  }
}
