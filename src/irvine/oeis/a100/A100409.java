package irvine.oeis.a100;

import irvine.oeis.FiniteSequence;

/**
 * A100409 Numbers n such that n is <code>d_1*d_2*...*d_k-th</code> composite number <code>(n=A002808(d_1*d_2*...*d_k))</code> where <code>d_1 d_2</code> ... <code>d_k</code> is the decimal expansion of n.
 * @author Georg Fischer
 */
public class A100409 extends FiniteSequence {

  /** Construct the sequence. */
  public A100409() {
    super(48, 68, 78, 88, 98);
  }
}
