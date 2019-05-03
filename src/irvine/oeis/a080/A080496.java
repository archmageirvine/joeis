package irvine.oeis.a080;

import irvine.oeis.FiniteSequence;

/**
 * A080496 <code>a(n) = A080495(n+1)/A080495(n)</code>.
 * @author Georg Fischer
 */
public class A080496 extends FiniteSequence {

  /** Construct the sequence. */
  public A080496() {
    super(12, 2, 2, 17, 8, 13);
  }
}
