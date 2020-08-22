package irvine.oeis.a100;

import irvine.oeis.FiniteSequence;

/**
 * A100409 Numbers n such that n is d_1*d_2*...*d_k-th composite number (n=A002808(d_1*d_2*...*d_k)) where d_1 d_2 ... d_k is the decimal expansion of n.
 * @author Georg Fischer
 */
public class A100409 extends FiniteSequence {

  /** Construct the sequence. */
  public A100409() {
    super(48, 68, 78, 88, 98);
  }
}
