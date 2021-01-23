package irvine.oeis.a052;

import irvine.oeis.LinearRecurrence;

/**
 * A052987 Expansion of (1-2x^2)/(1-2x-2x^2+2x^3).
 * @author Sean A. Irvine
 */
public class A052987 extends LinearRecurrence {

  /** Construct the sequence. */
  public A052987() {
    super(new long[] {-2, 2, 2}, new long[] {1, 2, 4});
  }
}
