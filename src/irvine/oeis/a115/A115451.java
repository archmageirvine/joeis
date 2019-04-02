package irvine.oeis.a115;

import irvine.oeis.LinearRecurrence;

/**
 * A115451 Expansion of 1/((1+x)*(1-2*x)*(1+x^2)).
 * @author Sean A. Irvine
 */
public class A115451 extends LinearRecurrence {

  /** Construct the sequence. */
  public A115451() {
    super(new long[] {2, 1, 1, 1}, new long[] {1, 1, 2, 4});
  }
}
