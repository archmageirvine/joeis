package irvine.oeis.a117;

import irvine.oeis.LinearRecurrence;

/**
 * A117571 Expansion of (1+2*x^2)/((1-x)*(1-x^3)).
 * @author Sean A. Irvine
 */
public class A117571 extends LinearRecurrence {

  /** Construct the sequence. */
  public A117571() {
    super(new long[] {-1, 1, 0, 1}, new long[] {1, 1, 3, 4});
  }
}
