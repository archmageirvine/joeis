package irvine.oeis.a076;

import irvine.oeis.FiniteSequence;

/**
 * A076159 Numbers n such that <code>n =</code> sod_4 - sod_3 + sod_2 - sod_1, where sod_k is the sum of k-th powers of digits of n.
 * @author Georg Fischer
 */
public class A076159 extends FiniteSequence {

  /** Construct the sequence. */
  public A076159() {
    super(0, 214, 224, 2374, 4048);
  }
}
