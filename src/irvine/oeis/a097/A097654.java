package irvine.oeis.a097;

import irvine.oeis.FiniteSequence;

/**
 * A097654 Numbers n such that n=|d_1!!-d_2!!+...+(-1)^(k-1)*d_k!!| where d_1 d_2 <code>...</code> d_k is the decimal expansion of n.
 * @author Georg Fischer
 */
public class A097654 extends FiniteSequence {

  /** Construct the sequence. */
  public A097654() {
    super(1, 2, 3, 380);
  }
}
