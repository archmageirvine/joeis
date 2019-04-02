package irvine.oeis.a221;

import irvine.oeis.LinearRecurrence;

/**
 * A221049 Expansion of (1+2*x+3*x^2-x^3)/((1-x)*(1+x)*(1-2*x)*(1+2*x)).
 * @author Sean A. Irvine
 */
public class A221049 extends LinearRecurrence {

  /** Construct the sequence. */
  public A221049() {
    super(new long[] {-4, 0, 5, 0}, new long[] {1, 2, 8, 9});
  }
}
