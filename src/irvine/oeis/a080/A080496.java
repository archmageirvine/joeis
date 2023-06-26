package irvine.oeis.a080;

import irvine.oeis.FiniteSequence;

/**
 * A080496 a(n) = A080495(n+1)/A080495(n).
 * @author Georg Fischer
 */
public class A080496 extends FiniteSequence {

  /** Construct the sequence. */
  public A080496() {
    super(1, FINITE, 12, 2, 2, 17, 8, 13);
  }
}
