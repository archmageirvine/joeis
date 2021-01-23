package irvine.oeis.a249;

import irvine.oeis.LinearRecurrence;

/**
 * A249994 Expansion of 1/((1-2*x)*(1+3*x)*(1-4*x)).
 * @author Sean A. Irvine
 */
public class A249994 extends LinearRecurrence {

  /** Construct the sequence. */
  public A249994() {
    super(new long[] {-24, 10, 3}, new long[] {1, 3, 19});
  }
}
