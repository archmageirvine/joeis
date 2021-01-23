package irvine.oeis.a013;

import irvine.oeis.LinearRecurrence;

/**
 * A013326 Expansion of -(2*x^3-x^2+x-1)/(x^4-3*x^3+3*x^2-3*x+1).
 * @author Sean A. Irvine
 */
public class A013326 extends LinearRecurrence {

  /** Construct the sequence. */
  public A013326() {
    super(new long[] {-1, 3, -3, 3}, new long[] {1, 2, 4, 7});
  }
}
