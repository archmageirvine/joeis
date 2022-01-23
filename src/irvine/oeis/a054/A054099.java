package irvine.oeis.a054;

import irvine.oeis.triangle.RowSumSequence;

/**
 * A054099 Sum{T(n,k): k=0, 1,...,n}, array T as in A054098.
 * @author Georg Fischer
 */
public class A054099 extends RowSumSequence {

  /** Construct the sequence. */
  public A054099() {
    super(new A054098());
  }
}
