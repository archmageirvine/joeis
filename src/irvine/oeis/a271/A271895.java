package irvine.oeis.a271;

import irvine.oeis.LinearRecurrence;

/**
 * A271895 Expansion of (1-2*x^2) / ( 1-2*x-4*x^2+6*x^3 ).
 * @author Sean A. Irvine
 */
public class A271895 extends LinearRecurrence {

  /** Construct the sequence. */
  public A271895() {
    super(new long[] {-6, 4, 2}, new long[] {1, 2, 6});
  }
}
