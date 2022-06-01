package irvine.oeis.a233;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A233247 Expansion of ( 1-x^3-x^2 ) / ( (x^3-x^2-1)*(x^3+2*x^2+x-1) ).
 * @author Sean A. Irvine
 */
public class A233247 extends LinearRecurrence {

  /** Construct the sequence. */
  public A233247() {
    super(new long[] {-1, -1, 1, 3, 1, 1}, new long[] {1, 1, 1, 4, 9, 16});
  }
}
