package irvine.oeis.a271;

import irvine.oeis.LinearRecurrence;

/**
 * A271180 Expansion of (4*x^3-7*x^2+4*x-1)/(x^6-4*x^5+4*x^4+x^3-7*x^2+5*x-1).
 * @author Sean A. Irvine
 */
public class A271180 extends LinearRecurrence {

  /** Construct the sequence. */
  public A271180() {
    super(new long[] {1, -4, 4, 1, -7, 5}, new long[] {1, 1, 5, 15, 45, 125});
  }
}
