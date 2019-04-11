package irvine.oeis.a175;

import irvine.oeis.LinearRecurrence;

/**
 * A175898 Expansion of <code>(1+3*x+9*x^2+9*x^3+9*x^4+3*x^5+x^6) /( (1+x)^2 * (1-x)^5 )</code>.
 * @author Sean A. Irvine
 */
public class A175898 extends LinearRecurrence {

  /** Construct the sequence. */
  public A175898() {
    super(new long[] {1, -3, 1, 5, -5, -1, 3}, new long[] {1, 6, 26, 76, 186, 386, 726});
  }
}
