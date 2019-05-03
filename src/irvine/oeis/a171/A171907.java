package irvine.oeis.a171;

import irvine.oeis.FiniteSequence;

/**
 * A171907 <code>a(n)=</code> Number of <code>5 X 5</code> permutation matrices with trace n and determinant <code>+1</code>.
 * @author Georg Fischer
 */
public class A171907 extends FiniteSequence {

  /** Construct the sequence. */
  public A171907() {
    super(24, 15, 20, 0, 0, 1);
  }
}
