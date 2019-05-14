package irvine.oeis.a052;

import irvine.oeis.LinearRecurrence;

/**
 * A052535 Expansion of <code>(1-x)*(1+x)/(1-x-2*x^2+x^4)</code>.
 * @author Sean A. Irvine
 */
public class A052535 extends LinearRecurrence {

  /** Construct the sequence. */
  public A052535() {
    super(new long[] {-1, 0, 2, 1}, new long[] {1, 1, 2, 4});
  }
}
