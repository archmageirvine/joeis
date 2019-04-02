package irvine.oeis.a168;

import irvine.oeis.LinearRecurrence;

/**
 * A168639 Expansion of x*(1 + x^2 - x^3) ) / ( (1-x)*(1-x-x^4) ).
 * @author Sean A. Irvine
 */
public class A168639 extends LinearRecurrence {

  /** Construct the sequence. */
  public A168639() {
    super(new long[] {-1, 1, 0, -1, 2}, new long[] {0, 1, 2, 4, 5});
  }
}
