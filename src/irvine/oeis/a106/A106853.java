package irvine.oeis.a106;

import irvine.oeis.LinearRecurrence;

/**
 * A106853 Expansion of <code>1/(1 - x + 4*x^2)</code>.
 * @author Sean A. Irvine
 */
public class A106853 extends LinearRecurrence {

  /** Construct the sequence. */
  public A106853() {
    super(new long[] {-4, 1}, new long[] {1, 1});
  }
}
