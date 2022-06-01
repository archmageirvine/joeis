package irvine.oeis.a052;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A052780 Expansion of e.g.f. x^2*exp(4*x).
 * @author Sean A. Irvine
 */
public class A052780 extends LinearRecurrence {

  /** Construct the sequence. */
  public A052780() {
    super(new long[] {64, -48, 12}, new long[] {0, 0, 2});
  }
}
