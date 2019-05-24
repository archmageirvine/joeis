package irvine.oeis.a076;

import irvine.oeis.FiniteSequence;

/**
 * A076159 Numbers k such that k <code>= sod_4 - sod_3 + sod_2 - sod_1</code>, where <code>sod_j</code> is the sum of j-th powers of digits of k.
 * @author Georg Fischer
 */
public class A076159 extends FiniteSequence {

  /** Construct the sequence. */
  public A076159() {
    super(0, 214, 224, 2374, 4048);
  }
}
