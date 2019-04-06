package irvine.oeis.a139;

import irvine.oeis.FiniteSequence;

/**
 * A139409 Numbers n such that n=d_1!!^2+d_2!!^2+...+d_k!!^2 where d_1d_2...d_k is the decimal expansion of n.
 * @author Georg Fischer
 */
public class A139409 extends FiniteSequence {

  /** Construct the sequence. */
  public A139409() {
    super(1, 11037, 158712, 904117, 906373);
  }
}
