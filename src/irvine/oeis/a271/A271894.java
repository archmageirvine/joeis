package irvine.oeis.a271;

import irvine.oeis.LinearRecurrence;

/**
 * A271894 Expansion of (1+x-3*x^2) / ( 1-2*x-4*x^2+6*x^3 ).
 * @author Sean A. Irvine
 */
public class A271894 extends LinearRecurrence {

  /** Construct the sequence. */
  public A271894() {
    super(new long[] {-6, 4, 2}, new long[] {1, 3, 7});
  }
}
