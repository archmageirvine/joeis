package irvine.oeis.a052;

import irvine.oeis.LinearRecurrence;

/**
 * A052938 Expansion of (1 + 2*x - 2*x^2)/( (1+x)*(1-x)^2 ).
 * @author Sean A. Irvine
 */
public class A052938 extends LinearRecurrence {

  /** Construct the sequence. */
  public A052938() {
    super(new long[] {-1, 1, 1}, new long[] {1, 3, 2});
  }
}
