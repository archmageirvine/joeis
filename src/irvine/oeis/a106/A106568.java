package irvine.oeis.a106;

import irvine.oeis.LinearRecurrence;

/**
 * A106568 Expansion of <code>4*x/(1-4*x-4*x^2)</code>.
 * @author Sean A. Irvine
 */
public class A106568 extends LinearRecurrence {

  /** Construct the sequence. */
  public A106568() {
    super(new long[] {4, 4}, new long[] {0, 4});
  }
}
