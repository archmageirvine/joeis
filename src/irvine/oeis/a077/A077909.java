package irvine.oeis.a077;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A077909 Expansion of 1/((1-x)*(1+x+x^2+2*x^3)).
 * @author Sean A. Irvine
 */
public class A077909 extends LinearRecurrence {

  /** Construct the sequence. */
  public A077909() {
    super(new long[] {2, -1, 0, 0}, new long[] {1, 0, 0, -1});
  }
}
