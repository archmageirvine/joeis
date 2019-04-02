package irvine.oeis.a052;

import irvine.oeis.LinearRecurrence;

/**
 * A052942 Expansion of 1/((1+x)*(1-2*x+2*x^2-2*x^3)).
 * @author Sean A. Irvine
 */
public class A052942 extends LinearRecurrence {

  /** Construct the sequence. */
  public A052942() {
    super(new long[] {2, 0, 0, 1}, new long[] {1, 1, 1, 1});
  }
}
