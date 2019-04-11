package irvine.oeis.a123;

import irvine.oeis.LinearRecurrence;

/**
 * A123012 Expansion of <code>1/(1 - 2*x - 21*x^2)</code>.
 * @author Sean A. Irvine
 */
public class A123012 extends LinearRecurrence {

  /** Construct the sequence. */
  public A123012() {
    super(new long[] {21, 2}, new long[] {1, 2});
  }
}
