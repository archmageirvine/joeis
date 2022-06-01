package irvine.oeis.a168;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A168071 Expansion of (1-3*x^2-4*x^3)/((1-x)^2*(1+x+x^2)).
 * @author Sean A. Irvine
 */
public class A168071 extends LinearRecurrence {

  /** Construct the sequence. */
  public A168071() {
    super(new long[] {-1, 1, 0, 1}, new long[] {1, 1, -2, -5});
  }
}
