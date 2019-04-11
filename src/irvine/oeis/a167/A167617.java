package irvine.oeis.a167;

import irvine.oeis.LinearRecurrence;

/**
 * A167617 G.f.: <code>x^2*(3+3*x+x^2) / ( (2*x+1) * (1+x) * (1+x+x^2) * (x^2-x+1) ) </code>.
 * @author Sean A. Irvine
 */
public class A167617 extends LinearRecurrence {

  /** Construct the sequence. */
  public A167617() {
    super(new long[] {-2, -3, -3, -3, -3, -3}, new long[] {0, 0, 3, -6, 10, -21});
  }
}
