package irvine.oeis.a188;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A188067 Expansion of x^2*(x^3+2*x^2+x+1)/((x-1)*(x+1))^4.
 * @author Sean A. Irvine
 */
public class A188067 extends LinearRecurrence {

  /** Construct the sequence. */
  public A188067() {
    super(new long[] {-1, 0, 4, 0, -6, 0, 4, 0}, new long[] {0, 0, 1, 1, 6, 5, 18, 14});
  }
}
