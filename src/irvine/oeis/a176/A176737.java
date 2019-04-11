package irvine.oeis.a176;

import irvine.oeis.LinearRecurrence;

/**
 * A176737 Expansion of <code>1 / (1-4*x^2-3*x^3)</code>. <code>(4</code>,3)-Padovan sequence.
 * @author Sean A. Irvine
 */
public class A176737 extends LinearRecurrence {

  /** Construct the sequence. */
  public A176737() {
    super(new long[] {3, 4, 0}, new long[] {1, 0, 4});
  }
}
