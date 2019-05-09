package irvine.oeis.a274;

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A274039 Expansion of <code>(x^4 + x^10) / (1 - 2*x + x^2)</code>.
 * @author Sean A. Irvine
 */
public class A274039 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A274039() {
    super(new long[] {0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1}, new long[] {1, -2, 1});
  }
}
