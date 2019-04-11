package irvine.oeis.a157;

import irvine.oeis.LinearRecurrence;

/**
 * A157241 G.f. <code>x/((1-x)*(4*x^2-2*x+1))</code>.
 * @author Sean A. Irvine
 */
public class A157241 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157241() {
    super(new long[] {4, -6, 3}, new long[] {0, 1, 3});
  }
}
