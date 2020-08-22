package irvine.oeis.a052;

import irvine.oeis.LinearRecurrence;

/**
 * A052994 Expansion of 2x(1-x)/(1-2x-x^2+x^3).
 * @author Sean A. Irvine
 */
public class A052994 extends LinearRecurrence {

  /** Construct the sequence. */
  public A052994() {
    super(new long[] {-1, 1, 2}, new long[] {0, 2, 2});
  }
}
