package irvine.oeis.a052;

import irvine.oeis.LinearRecurrence;

/**
 * A052978 Expansion of (1-2*x)/(1-4*x-2*x^2+4*x^3).
 * @author Sean A. Irvine
 */
public class A052978 extends LinearRecurrence {

  /** Construct the sequence. */
  public A052978() {
    super(new long[] {-4, 2, 4}, new long[] {1, 2, 10});
  }
}
