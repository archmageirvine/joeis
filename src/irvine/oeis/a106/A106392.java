package irvine.oeis.a106;

import irvine.oeis.LinearRecurrence;

/**
 * A106392 Expansion of <code>1/(1 - 6*x + 10*x^2)</code>.
 * @author Sean A. Irvine
 */
public class A106392 extends LinearRecurrence {

  /** Construct the sequence. */
  public A106392() {
    super(new long[] {-10, 6}, new long[] {1, 6});
  }
}
