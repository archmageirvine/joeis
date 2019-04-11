package irvine.oeis.a038;

import irvine.oeis.LinearRecurrence;

/**
 * A038391 Expansion of <code>(x^3+2*x+1) / ((x-1)^4*(x^2+x+1)^2)</code>.
 * @author Sean A. Irvine
 */
public class A038391 extends LinearRecurrence {

  /** Construct the sequence. */
  public A038391() {
    super(new long[] {-1, 2, -1, 2, -4, 2, -1, 2}, new long[] {1, 4, 7, 13, 23, 33, 48, 69});
  }
}
