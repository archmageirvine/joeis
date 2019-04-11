package irvine.oeis.a052;

import irvine.oeis.LinearRecurrence;

/**
 * A052545 Expansion of <code>(1-x)^2/(1-3*x+x^3)</code>.
 * @author Sean A. Irvine
 */
public class A052545 extends LinearRecurrence {

  /** Construct the sequence. */
  public A052545() {
    super(new long[] {-1, 0, 3}, new long[] {1, 1, 4});
  }
}
