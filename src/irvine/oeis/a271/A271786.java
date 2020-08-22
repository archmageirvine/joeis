package irvine.oeis.a271;

import irvine.oeis.LinearRecurrence;

/**
 * A271786 Expansion of 2*(1-x)*(2*x^2+4*x+1) / (1-x-x^2)^2.
 * @author Sean A. Irvine
 */
public class A271786 extends LinearRecurrence {

  /** Construct the sequence. */
  public A271786() {
    super(new long[] {-1, -2, 1, 2}, new long[] {2, 10, 18, 38});
  }
}
