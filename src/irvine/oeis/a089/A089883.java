package irvine.oeis.a089;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A089883 Expansion of (1-4*x+6*x^2-3*x^3)/((1-3*x)*(1-2*x)*(1-3*x+x^2)).
 * @author Sean A. Irvine
 */
public class A089883 extends LinearRecurrence {

  /** Construct the sequence. */
  public A089883() {
    super(new long[] {-6, 23, -22, 8}, new long[] {1, 4, 16, 60});
  }
}
