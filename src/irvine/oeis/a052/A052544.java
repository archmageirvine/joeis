package irvine.oeis.a052;

import irvine.oeis.LinearRecurrence;

/**
 * A052544 Expansion of <code>(1-x)^2/(1-4*x+3*x^2-x^3)</code>.
 * @author Sean A. Irvine
 */
public class A052544 extends LinearRecurrence {

  /** Construct the sequence. */
  public A052544() {
    super(new long[] {1, -3, 4}, new long[] {1, 2, 6});
  }
}
