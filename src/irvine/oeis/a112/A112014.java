package irvine.oeis.a112;

import irvine.oeis.FiniteSequence;

/**
 * A112014 Numbers m with odd length such that m = d_1+(d_2^d_3)+ ...+(d_(k-1)^d_k) where d_1 d_2 ... d_k is the decimal expansion of m.
 * @author Georg Fischer
 */
public class A112014 extends FiniteSequence {

  /** Construct the sequence. */
  public A112014() {
    super(1, FINITE, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 736, 15642, 15662, 1680129, 1686394);
  }
}
