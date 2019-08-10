package irvine.oeis.a123;

import irvine.oeis.LinearRecurrence;

/**
 * A123877 Expansion of <code>(1+2*x)/(1+3*x+3*x^2)</code>.
 * @author Sean A. Irvine
 */
public class A123877 extends LinearRecurrence {

  /** Construct the sequence. */
  public A123877() {
    super(new long[] {-3, -3}, new long[] {1, -1});
  }
}
