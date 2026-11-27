package irvine.oeis.a100;

import irvine.oeis.FiniteSequence;

/**
 * A100409 Numbers m such that m is d_1*d_2*...*d_k-th composite number (m=A002808(d_1*d_2*...*d_k)) where d_1 d_2 ... d_k is the decimal expansion of m.
 * @author Georg Fischer
 */
public class A100409 extends FiniteSequence {

  /** Construct the sequence. */
  public A100409() {
    super(1, FINITE, 48, 68, 78, 88, 98);
  }
}
