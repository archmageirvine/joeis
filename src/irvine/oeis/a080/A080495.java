package irvine.oeis.a080;

import irvine.oeis.FiniteSequence;

/**
 * A080495 a(1) = 1, a(2) = 12, a(n) = smallest multiple of a(n-1) beginning with the least significant digit of a(n-1).
 * @author Georg Fischer
 */
public class A080495 extends FiniteSequence {

  /** Construct the sequence. */
  public A080495() {
    super(1, 12, 24, 48, 816, 6528, 84864, 424320);
  }
}
