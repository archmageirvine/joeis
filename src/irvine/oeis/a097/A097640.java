package irvine.oeis.a097;

import irvine.oeis.FiniteSequence;

/**
 * A097640 Numbers n such that n=(d_1+d_2+...+d_k)*prime(d_1+d_2+...+d_k) where d_1 d_2 ... d_k is the decimal expansion of n.
 * @author Georg Fischer
 */
public class A097640 extends FiniteSequence {

  /** Construct the sequence. */
  public A097640() {
    super(1, FINITE, 152, 207, 444, 1098);
  }
}
