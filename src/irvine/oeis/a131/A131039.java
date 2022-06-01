package irvine.oeis.a131;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A131039 Expansion of (1-x)*(2*x^2-4*x+1)/(1-2*x+5*x^2-4*x^3+x^4).
 * @author Sean A. Irvine
 */
public class A131039 extends LinearRecurrence {

  /** Construct the sequence. */
  public A131039() {
    super(new long[] {-1, 4, -5, 2}, new long[] {1, -3, -5, 7});
  }
}
