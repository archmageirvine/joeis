package irvine.oeis.a220;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A220944 Expansion of (1+3*x+5*x^2-x^3)/((1-x^2)*(1-3*x^2)).
 * @author Sean A. Irvine
 */
public class A220944 extends LinearRecurrence {

  /** Construct the sequence. */
  public A220944() {
    super(new long[] {-3, 0, 4, 0}, new long[] {1, 3, 9, 11});
  }
}
