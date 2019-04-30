package irvine.oeis.a166;

import irvine.oeis.LinearRecurrence;

/**
 * A166868 Convolution of <code>Jacobsthal(n+2)</code> and <code>Pell(n+1)</code>.
 * @author Sean A. Irvine
 */
public class A166868 extends LinearRecurrence {

  /** Construct the sequence. */
  public A166868() {
    super(new long[] {-2, -5, 1, 3}, new long[] {1, 5, 16, 48});
  }
}
