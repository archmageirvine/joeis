package irvine.oeis.a052;

import irvine.oeis.LinearRecurrence;

/**
 * A052907 Expansion of <code>1/(1 - 2*x^2 - 2*x^3)</code>.
 * @author Sean A. Irvine
 */
public class A052907 extends LinearRecurrence {

  /** Construct the sequence. */
  public A052907() {
    super(new long[] {2, 2, 0}, new long[] {1, 0, 2});
  }
}
